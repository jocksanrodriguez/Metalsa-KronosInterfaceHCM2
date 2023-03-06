package com.metalsa.api.dao.impl;

import com.metalsa.api.dao.HcmDAO;
import com.metalsa.api.model.entity.LaborLevel;
import com.metalsa.api.model.hcm.DataDs;
import com.metalsa.api.payload.LaborLevelDTO;
import com.metalsa.api.util.Constants;
import com.metalsa.api.util.HcmCloudUtil;
import com.metalsa.api.wsdl.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.xml.namespace.QName;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Repository
public class HcmDAOImpl implements HcmDAO {
    @Value("${hcm.userid}")
    private String hcmUserID;

    @Value("${hcm.password}")
    private String hcmPassword;

    @Value("${hcm.reporte.niveleslabor.ruta}")
    private String absolutePathReportNivelesLab;

    @Override
    public List<LaborLevelDTO> getLaborLevels(String sEffectiveDate) {

        ReportRequest reportRequest = new ReportRequest();
        ParamNameValues paramNameValues = new ParamNameValues();
        ParamNameValue paramNameValue = new ParamNameValue();
        ArrayOfParamNameValue arrayOfParamNameValue = new ArrayOfParamNameValue();
        ArrayOfString arrayOfString = new ArrayOfString();
        ReportResponse reportResponse = new ReportResponse();
        HcmCloudUtil hcmCloudUtil = new HcmCloudUtil();
        DataDs dataDsResponse = new DataDs();
        List<LaborLevelDTO> nivelesLabor = new ArrayList<>();

        try {
            arrayOfString.getItem().add(sEffectiveDate);
            paramNameValue.setName(Constants.HCMWSDLNAMEPARAM1);
            paramNameValue.setValues(arrayOfString);
            arrayOfParamNameValue.getItem().add(paramNameValue);
            paramNameValues.setListOfParamNameValues(arrayOfParamNameValue);

            reportRequest.setParameterNameValues(paramNameValues);
            reportRequest.setAttributeFormat(Constants.HCMWSDLREPORTFORMATOUT);
            reportRequest.setReportAbsolutePath(absolutePathReportNivelesLab);
            reportRequest.setSizeOfDataChunkDownload(-1);
            reportResponse = this.getReportOracleHCM(reportRequest, hcmUserID, hcmPassword);
            dataDsResponse = hcmCloudUtil.desglosarXmlHcmResponse(new String(reportResponse.getReportBytes()));

            if(dataDsResponse != null && dataDsResponse.getG1() != null && dataDsResponse.getG1().size()!=0) {

                for(int x=0; x<dataDsResponse.getG1().size(); x++) {
                    LaborLevelDTO nivelInfo = new LaborLevelDTO();

                    nivelInfo.setReqCode(dataDsResponse.getG1().get(x).getReqCode()==null?new Integer(0):new Integer(dataDsResponse.getG1().get(x).getReqCode()));
                    nivelInfo.setLevelName(dataDsResponse.getG1().get(x).getLaborLevelEntryName()==null?"-":dataDsResponse.getG1().get(x).getLaborLevelEntryName());
                    nivelInfo.setDescription(dataDsResponse.getG1().get(x).getLaborLabelName()==null?"-":dataDsResponse.getG1().get(x).getLaborLabelName());

                    if(dataDsResponse.getG1().get(x).getLaborLevelName()!=null && !dataDsResponse.getG1().get(x).getLaborLevelName().isEmpty()) {
                        if(dataDsResponse.getG1().get(x).getLaborLevelName().contains(Constants.HCM_LABOR_LEVEL_CC_PROYECTO_SLASH)) {
                            nivelInfo.setLevelType(Constants.HCM_LABOR_LEVEL_CC_PROYECTO_UNDERSCORE);
                        }else {
                            nivelInfo.setLevelType(dataDsResponse.getG1().get(x).getLaborLevelName());
                        }
                    }else {
                        nivelInfo.setLevelType("-");
                    }



                    nivelesLabor.add(nivelInfo);
                }
            }

            return nivelesLabor;
        }catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    private ReportResponse getReportOracleHCM (ReportRequest reportRequest, String userID, String password) {
        ReportResponse reportResponse = new ReportResponse();

        try {
            ReportService_Service reportServiceService =
                    new ReportService_Service(new URL(Constants.HCMWSDLURL),
                            new QName(Constants.HCMWSDLQNURI, Constants.HCMWSDLLOCALPART));
            reportResponse = reportServiceService.getReportService().runReport(reportRequest, userID, password);

            return reportResponse;
        }catch(Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
