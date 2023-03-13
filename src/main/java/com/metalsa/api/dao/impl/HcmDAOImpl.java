package com.metalsa.api.dao.impl;

import com.metalsa.api.dao.HcmDAO;
import com.metalsa.api.model.hcm.DataDs;
import com.metalsa.api.payload.EmployeeDTO;
import com.metalsa.api.payload.LaborLevelDTO;
import com.metalsa.api.util.Constants;
import com.metalsa.api.util.HcmCloudUtil;
import com.metalsa.api.wsdl.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.xml.namespace.QName;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Slf4j
@Repository
public class HcmDAOImpl implements HcmDAO {
    @Value("${hcm.userid}")
    private String hcmUserID;

    @Value("${hcm.password}")
    private String hcmPassword;

    @Value("${hcm.reporte.niveleslabor.ruta}")
    private String absolutePathReportNivelesLab;

    @Value("${hcm.reporte.empleadoshcm.ruta}")
    private String absolutePathReportEmpleadosHcm;

    @Override
    public List<EmployeeDTO> getEmployees() {
        ReportRequest reportRequest = new ReportRequest();
        ReportResponse reportResponse = new ReportResponse();
        List<EmployeeDTO> employeeDTOList = new ArrayList<EmployeeDTO>();

        try {
            reportRequest.setAttributeFormat(Constants.HCMWSDLREPORTFORMATOUTCSV);
            reportRequest.setReportAbsolutePath(absolutePathReportEmpleadosHcm);
            reportRequest.setSizeOfDataChunkDownload(-1);
            reportResponse = this.getReportOracleHCM(reportRequest, hcmUserID, hcmPassword);

            String csvEmp = null;
            String csvSplitBy = ",";

            if(reportResponse!=null && reportResponse.getReportBytes()!=null) {
                csvEmp = new String(reportResponse.getReportBytes());

                Scanner scanner = new Scanner(new String(csvEmp));
                scanner.nextLine();//this avoid that it take the first line of the columns names. Don't removal

                while (scanner.hasNext()) {
                    String lineaRegistro = scanner.nextLine();
                    String[] empl =lineaRegistro.split(csvSplitBy,-1);
                    EmployeeDTO emp = new EmployeeDTO();

                    emp.setReqCode(empl[0].isEmpty()?new Integer(0):new Integer(empl[0]));
                    emp.setPersonType(empl[1].isEmpty()?new Integer(0):new Integer(empl[1]));
                    emp.setPersonNum(empl[2].isEmpty()?new Long(0):new Long(empl[2]));
                    emp.setFirstName(empl[3].isEmpty()?"-":empl[3].replace('"', ' ').trim());
                    emp.setLastName(empl[4].isEmpty()?"-":empl[4].replace('"', ' ').trim());
                    emp.setHireDate(new java.sql.Date( new SimpleDateFormat("dd/MM/yyyy").parse( empl[5].trim() ).getTime() ) );
                    emp.setTimezone(Constants.HCMEMPTIMEZONE);
                    emp.setLocation(empl[7].isEmpty()?"-":empl[7].replace('"', ' ').trim());
                    emp.setHomeLabor1(empl[8].isEmpty()?"-":empl[8].replace('"', ' ').trim());
                    emp.setHomeLabor2(empl[9].isEmpty()?"-":empl[9].replace('"', ' ').trim());
                    emp.setHomeLabor3(empl[10].isEmpty()?"-":empl[10].replace('"', ' ').trim());
                    emp.setHomeLabor4(empl[11].isEmpty()?"-":empl[11].replace('"', ' ').trim());
                    emp.setHomeLabor5(empl[12].isEmpty()?"-":empl[12].replace('"', ' ').trim());
                    emp.setHomeLabor6(empl[13].isEmpty()?"-":empl[13].replace('"', ' ').trim());
                    emp.setHomeLabor7(empl[14].isEmpty()?"-":empl[14].replace('"', ' ').trim());
                    emp.setGroupSched(empl[15].isEmpty()?"-":empl[15].replace('"', ' ').trim());
                    emp.setBadgeNum(empl[16].isEmpty()?"-":empl[16].replace('"', ' ').trim());
                    emp.setStatusDate(new java.sql.Date( new SimpleDateFormat("dd/MM/yyyy").parse( empl[17].trim() ).getTime() ));
                    emp.setUsername(empl[18].isEmpty()?"-":empl[18].replace('"', ' ').trim());
                    emp.setPassword(empl[19].isEmpty()?"-":empl[19].replace('"', ' ').trim());
                    emp.setEmployeeType(empl[20].isEmpty()?"-":empl[20].replace('"', ' ').trim());
                    emp.setAssignmentCat(empl[21].isEmpty()?"-":empl[21].replace('"', ' ').trim());
                    emp.setSupervisorNumber(empl[22].isEmpty()?"-":empl[22].replace('"', ' ').trim());
                    emp.setCompany(empl[23].isEmpty()?"-":empl[23].replace('"', ' ').trim());
                    emp.setEbsEmployeeId(empl[24].isEmpty()?"-":empl[24].replace('"', ' ').trim());
                    emp.setEmailAddress(empl[25].isEmpty()?"-":empl[25].replace('"', ' ').trim());
                    emp.setSocialSecurityId(empl[26].isEmpty()?"-":empl[26].replace('"', ' ').trim());
                    emp.setPhoneCell(empl[27].isEmpty()?"-":empl[27].replace('"', ' ').trim());
                    emp.setPhoneHome(empl[28].isEmpty()?"-":empl[28].replace('"', ' ').trim());

                    employeeDTOList.add(emp);

                }
                scanner.close();
            }

            return employeeDTOList;
        }catch (Exception e){
            e.printStackTrace();
            log.error("An error occurred while trying to get employees from HCM");
            return null;
        }
    }

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
            log.error("An error occurred while trying to get labor levels on HCM");
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
