package com.metalsa.api.dao.impl;

import com.metalsa.api.dao.KronosDAO;
import com.metalsa.api.model.kronos.EmployeeData;
import com.metalsa.api.model.kronos.KronosWFC;
import com.metalsa.api.util.Constants;
import com.metalsa.api.util.SendDataKronosUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Repository
public class KronosDAOImpl implements KronosDAO {

    @Value("${kronos.url}")
    private String strUrl;

    @Value("${kronos.app.user}")
    private String krUser;

    @Value("${kronos.app.pass}")
    private String krPass;

    @Value("${kronos.xml.getruletransferbyperson}")
    private String xmlGetRuleTransfer;

    @Value("${kronos.xml.getloadpersonality}")
    private String xmlLoadPersonality;

    @Value("${kronos.xml.addnewemployee}")
    private String xmlAddNewEmployee;

    @Value("${kronos.xml.terminateemployee}")
    private String xmlTerminateEmployee;

    @Value("${kronos.xml.changedataemployee}")
    private String xmlChangeDataEmployee;

    @Value("${kronos.xml.deleteemploymentterms}")
    private String xmlDeleteEmploymentTerms;

    @Value("${kronos.xml.addlaborlevel}")
    private String xmlAddLaborLevel;

    @Value("${kronos.xml.getpunchdata}")
    private String xmlGetPunchData;

    @Value("${kronos.xml.insertabscommnote}")
    private String xmlInsertAbsenceComNote;

    @Value("${kronos.xml.insertpaycodebyday}")
    private String xmlInsertPayCodeByDay;

    @Value("${kronos.xml.deletepaycodebyday}")
    private String xmlDeletePayCodeByDay;

    @Value("${kronos.xml.deletelaborlevel}")
    private String xmlDeleteLaborLevel;

    @Value("${kronos.xml.recontractemployee}")
    private String xmlRecontractEmployee;

    @Value("${kronos.xml.loadExceptions}")
    private String xmlLoadExceptions;

    @Value("${kronos.xml.changedataemployee2}")
    private String xmlChangeDataEmployee2;

    @Value("${kronos.xml.loadGenie}")
    private String xmlLoadGenie;

    @Override
    public KronosWFC getGenieExceptions() {
        KronosWFC kronos = new KronosWFC();
        Map<String, String> params = new HashMap<>();
        try {
            SendDataKronosUtil sendDataKronos = new SendDataKronosUtil(strUrl);
            params.put("username", krUser);
            params.put("password", krPass);

            String xmlRequest = sendDataKronos.crearXmlRequest(params, xmlLoadExceptions);
            String xmlResponse = sendDataKronos.sendKronosRequest(xmlRequest);
            kronos = sendDataKronos.desglosarXmlKronosResponse(xmlResponse);
            kronos.setXmlRequest(xmlRequest);
            kronos.setXmlResponse(xmlResponse);

            if (kronos != null && kronos.getResponse() != null) {
                return kronos;
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public KronosWFC insertPayCode(Long personNum, Date dayDate, String payCodeName) {
        Map<String, String> params = new HashMap<>();
        KronosWFC kronos = new KronosWFC();

        try {
            SendDataKronosUtil sendDataKronos = new SendDataKronosUtil(strUrl);
            params.put("username", krUser);
            params.put("password", krPass);
            params.put("date", sendDataKronos.formatoFechaKronos(dayDate));
            params.put("personNum", personNum.toString());
            params.put("payCodeName", payCodeName);

            String xmlRequest = sendDataKronos.crearXmlRequest(params, xmlInsertPayCodeByDay);
            String xmlResponse = sendDataKronos.sendKronosRequest(xmlRequest);
            kronos = sendDataKronos.desglosarXmlKronosResponse(xmlResponse);
            kronos.setXmlRequest(xmlRequest);
            kronos.setXmlResponse(xmlResponse);

            if (kronos != null && kronos.getResponse() != null) {
                return kronos;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public KronosWFC deleteLaborLevel(String laborLevelName, String laborLevelType) {
        Map<String, String> params = new HashMap<>();
        KronosWFC kronos = new KronosWFC();

        try {
            SendDataKronosUtil sendDataKronos = new SendDataKronosUtil(strUrl);
            params.put("username", krUser);
            params.put("password", krPass);
            params.put("laborLevelDefinitionName", laborLevelName);
            params.put("laborLevelEntryName", laborLevelType);

            String xmlRequest = sendDataKronos.crearXmlRequest(params, xmlDeleteLaborLevel);
            String xmlResponse = sendDataKronos.sendKronosRequest(xmlRequest);
            kronos = sendDataKronos.desglosarXmlKronosResponse(xmlResponse);
            kronos.setXmlRequest(xmlRequest);
            kronos.setXmlResponse(xmlResponse);

            if (kronos != null && kronos.getResponse() != null) {
                return kronos;
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public KronosWFC deletePayCodeByDay(Long personNum, Date dayDate, String payCodeName) {
        Map<String, String> params = new HashMap<>();
        KronosWFC kronos = new KronosWFC();

        try {
            SendDataKronosUtil sendDataKronos = new SendDataKronosUtil(strUrl);
            params.put("username", krUser);
            params.put("password", krPass);
            params.put("date", sendDataKronos.formatoFechaKronos(dayDate));
            params.put("personNum", personNum.toString());
            params.put("payCodeName", payCodeName);

            String xmlRequest = sendDataKronos.crearXmlRequest(params, xmlDeletePayCodeByDay);
            String xmlResponse = sendDataKronos.sendKronosRequest(xmlRequest);
            kronos = sendDataKronos.desglosarXmlKronosResponse(xmlResponse);
            kronos.setXmlRequest(xmlRequest);
            kronos.setXmlResponse(xmlResponse);

            if (kronos != null && kronos.getResponse() != null) {
                return kronos;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public KronosWFC insertAbsence(Long personNum, Date dayDate, String payCodeName) {
        Map<String, String> params = new HashMap<>();
        KronosWFC kronos = new KronosWFC();

        try {
            SendDataKronosUtil sendDataKronos = new SendDataKronosUtil(strUrl);
            params.put("username", krUser);
            params.put("password", krPass);
            params.put("date", sendDataKronos.formatoFechaKronos(dayDate));
            params.put("personNum", personNum.toString());
            params.put("payCodeName", payCodeName);

            String xmlRequest = sendDataKronos.crearXmlRequest(params, xmlInsertPayCodeByDay);
            String xmlResponse = sendDataKronos.sendKronosRequest(xmlRequest);
            kronos = sendDataKronos.desglosarXmlKronosResponse(xmlResponse);
            kronos.setXmlRequest(xmlRequest);
            kronos.setXmlResponse(xmlResponse);

            if (kronos != null && kronos.getResponse() != null) {
                return kronos;
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public KronosWFC insertAbsence(Long personNum, Date dayDate, String payCodeName, String commentText, String noteText) {
        Map<String, String> params = new HashMap<>();
        KronosWFC kronos = new KronosWFC();

        try {
            SendDataKronosUtil sendDataKronos = new SendDataKronosUtil(strUrl);
            params.put("username", krUser);
            params.put("password", krPass);
            params.put("date", sendDataKronos.formatoFechaKronos(dayDate));
            params.put("personNum", personNum.toString());
            params.put("payCodeName", payCodeName);
            params.put("commentText", commentText);
            params.put("noteText", noteText);

            String xmlRequest = sendDataKronos.crearXmlRequest(params, xmlInsertAbsenceComNote);
            String xmlResponse = sendDataKronos.sendKronosRequest(xmlRequest);
            kronos = sendDataKronos.desglosarXmlKronosResponse(xmlResponse);
            kronos.setXmlRequest(xmlRequest);
            kronos.setXmlResponse(xmlResponse);

            if (kronos != null && kronos.getResponse() != null) {
                return kronos;
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public KronosWFC getPayCodeNameByDay(Long personNum, Date dayDate) {
        Map<String, String> params = new HashMap<>();
        KronosWFC kronos = new KronosWFC();

        try {
            SendDataKronosUtil sendDataKronos = new SendDataKronosUtil(strUrl);
            params.put("username", krUser);
            params.put("password", krPass);
            params.put("personNum", personNum.toString());
            params.put("startDateSpan", sendDataKronos.formatoFechaKronos(dayDate));
            params.put("endDateSpan", sendDataKronos.formatoFechaKronos(dayDate));

            String xmlRequest = sendDataKronos.crearXmlRequest(params, xmlGetPunchData);
            String xmlResponse = sendDataKronos.sendKronosRequest(xmlRequest);
            kronos = sendDataKronos.desglosarXmlKronosResponse(xmlResponse);
            kronos.setXmlRequest(xmlRequest);
            kronos.setXmlResponse(xmlResponse);

            if (kronos != null && kronos.getResponse() != null) {
                return kronos;
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public KronosWFC addLaborLevel(String description, String laborLevelName, String laborLevelType) {
        Map<String, String> params = new HashMap<>();
        KronosWFC kronos = new KronosWFC();

        try {
            SendDataKronosUtil sendDataKronos = new SendDataKronosUtil(strUrl);
            params.put("username", krUser);
            params.put("password", krPass);
            params.put("description", description);
            params.put("laborLevelDefinitionName", laborLevelName);
            params.put("laborLevelEntryName", laborLevelType);

            String xmlRequest = sendDataKronos.crearXmlRequest(params, xmlAddLaborLevel);
            String xmlResponse = sendDataKronos.sendKronosRequest(xmlRequest);
            kronos = sendDataKronos.desglosarXmlKronosResponse(xmlResponse);
            kronos.setXmlRequest(xmlRequest);
            kronos.setXmlResponse(xmlResponse);

            if (kronos != null && kronos.getResponse() != null) {
                return kronos;
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public KronosWFC deleteEmploymentTerms(Long personNum, Date originalStartDate) {
        Map<String, String> params = new HashMap<>();
        KronosWFC kronos = new KronosWFC();
        try {

            SendDataKronosUtil sendDataKronos = new SendDataKronosUtil(strUrl);
            params.put("username", krUser);
            params.put("password", krPass);
            params.put("personNumber", personNum.toString());
            params.put("osDate", sendDataKronos.formatoFechaKronos(originalStartDate));

            String xmlRequest = sendDataKronos.crearXmlRequest(params, xmlDeleteEmploymentTerms);
            String xmlResponse = sendDataKronos.sendKronosRequest(xmlRequest);
            kronos = sendDataKronos.desglosarXmlKronosResponse(xmlResponse);
            kronos.setXmlRequest(xmlRequest);
            kronos.setXmlResponse(xmlResponse);

            if (kronos != null && kronos.getResponse() != null) {
                return kronos;
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public KronosWFC changeDataEmployee(EmployeeData data) {
        Map<String, String> params = new HashMap<>();
        KronosWFC kronos = new KronosWFC();
        String xmlRequest = "";

        try {
            SendDataKronosUtil sendDataKronos = new SendDataKronosUtil(strUrl);
            params.put("username", krUser);
            params.put("password", krPass);
            params.put("accProfName", data.getAccessProfileName() != null ? data.getAccessProfileName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("accrualProfileName", data.getAccrualProfileName() != null ? data.getAccrualProfileName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("actFlagLic", data.getActiveFlagLicenceType() != null ? data.getActiveFlagLicenceType() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("authTypName", data.getAuthenticationTypeName() != null ? data.getAuthenticationTypeName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("badgeNum", data.getBadgeNumber() != null ? data.getBadgeNumber() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("compName", data.getCompanyNumber() != null ? data.getCompanyNumber() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("effectiveDate", data.getEffectiveDate() != null ? data.getEffectiveDate() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("emailAd", data.getUserName() != null ? data.getUserName() : "-");
            params.put("employmentStatusName", data.getEmploymentStatusName() != null ? data.getEmploymentStatusName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("firstName", data.getFirstName() != null ? data.getFirstName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("hireDate", data.getHireDate() != null ? data.getHireDate() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("laborAccName", data.getLaborAccountName() != null ? data.getLaborAccountName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("lastName", data.getLastName() != null ? data.getLastName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("locPolName", data.getLocalePolicyName() != null ? data.getLocalePolicyName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("notifProfName", data.getNotificationProfileName() != null ? data.getNotificationProfileName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("payRuleName", data.getPayRuleName() != null ? data.getPayRuleName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("personNumber", data.getPersonNumber() != null ? data.getPersonNumber() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("phoneCell", data.getPhoneCell() != null ? data.getPhoneCell() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("phoneHome", data.getPhoneHome() != null ? data.getPhoneHome() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("prefProfName", data.getPreferenceProfileName() != null ? data.getPreferenceProfileName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("professPayCodName", data.getProfessionalPayCodeName() != null ? data.getProfessionalPayCodeName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("supervName", data.getSupervisorName() != null ? data.getSupervisorName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("timeEnTyName", data.getTimeEntryTypeName() != null ? data.getTimeEntryTypeName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("userN", data.getUserName() != null ? data.getUserName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("userPass", data.getUserPassword() != null ? data.getUserPassword() : Constants.KR_XMLREQUESTPARAMNOTFOUND);

            if (data.getEmployeeType() != null && data.getEmployeeType().equals(Constants.KR_ADMN_EMPLOYEETYPE)) {
                params.remove("accProfName");
                params.remove("prefProfName");
                xmlRequest = sendDataKronos.crearXmlRequest(params, xmlChangeDataEmployee2);
            } else {
                xmlRequest = sendDataKronos.crearXmlRequest(params, xmlChangeDataEmployee);
            }

            String xmlResponse = sendDataKronos.sendKronosRequest(xmlRequest);
            kronos = sendDataKronos.desglosarXmlKronosResponse(xmlResponse);
            kronos.setXmlRequest(xmlRequest);
            kronos.setXmlResponse(xmlResponse);

            if (kronos != null && kronos.getResponse() != null) {
                return kronos;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public KronosWFC terminateContractEmployee(Long personNum, String effectiveDate) {
        Map<String, String> params = new HashMap<>();
        KronosWFC kronos = new KronosWFC();

        try {
            SendDataKronosUtil sendDataKronos = new SendDataKronosUtil(strUrl);
            params.put("username", krUser);
            params.put("password", krPass);
            params.put("personNumber", personNum.toString());
            params.put("effectiveDate", effectiveDate);

            String xmlRequest = sendDataKronos.crearXmlRequest(params, xmlTerminateEmployee);
            String xmlResponse = sendDataKronos.sendKronosRequest(xmlRequest);
            kronos = sendDataKronos.desglosarXmlKronosResponse(xmlResponse);
            kronos.setXmlRequest(xmlRequest);
            kronos.setXmlResponse(xmlResponse);

            if (kronos != null && kronos.getResponse() != null) {
                return kronos;
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public KronosWFC addNewEmployee(EmployeeData data, boolean rehire) {
        Map<String, String> params = new HashMap<>();
        KronosWFC kronos = new KronosWFC();
        String xmlRequest = "";

        try {
            SendDataKronosUtil sendDataKronos = new SendDataKronosUtil(strUrl);
            params.put("username", krUser);
            params.put("password", krPass);
            params.put("accProfName", data.getAccessProfileName() != null ? data.getAccessProfileName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("accrualProfileName", data.getAccrualProfileName() != null ? data.getAccrualProfileName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("actFlagLic", data.getActiveFlagLicenceType() != null ? data.getActiveFlagLicenceType() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("authTypName", data.getAuthenticationTypeName() != null ? data.getAuthenticationTypeName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("badgeNum", data.getBadgeNumber() != null ? data.getBadgeNumber() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("compName", data.getCompanyNumber() != null ? data.getCompanyNumber() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("deviceGrpName", data.getDeviceGroupName() != null ? data.getDeviceGroupName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("effectiveDate", data.getEffectiveDate() != null ? data.getEffectiveDate() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("emailAd", data.getUserName() != null ? data.getUserName() : "-");
            params.put("employmentStatusName", data.getEmploymentStatusName() != null ? data.getEmploymentStatusName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("empTermAssign", data.getEmploymentTermAssignment() != null ? data.getEmploymentTermAssignment() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("endDate", data.getEndDate() != null ? data.getEndDate() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("firstName", data.getFirstName() != null ? data.getFirstName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("hireDate", data.getHireDate() != null ? data.getHireDate() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("laborAccName", data.getLaborAccountName() != null ? data.getLaborAccountName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("lastName", data.getLastName() != null ? data.getLastName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("locPolName", data.getLocalePolicyName() != null ? data.getLocalePolicyName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("notifProfName", data.getNotificationProfileName() != null ? data.getNotificationProfileName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("payRuleName", data.getPayRuleName() != null ? data.getPayRuleName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("personNumber", data.getPersonNumber() != null ? data.getPersonNumber() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("phoneCell", data.getPhoneCell() != null ? data.getPhoneCell() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("phoneHome", data.getPhoneHome() != null ? data.getPhoneHome() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("prefProfName", data.getPreferenceProfileName() != null ? data.getPreferenceProfileName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("professPayCodName", data.getProfessionalPayCodeName() != null ? data.getProfessionalPayCodeName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("startDate", data.getStartDate() != null ? data.getStartDate() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("supervName", data.getSupervisorName() != null ? data.getSupervisorName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("timeEnTyName", data.getTimeEntryTypeName() != null ? data.getTimeEntryTypeName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("userN", data.getUserName() != null ? data.getUserName() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
            params.put("userPass", data.getUserPassword() != null ? data.getUserPassword() : Constants.KR_XMLREQUESTPARAMNOTFOUND);

            /*String xmlResponse = sendDataKronos.sendKronosRequest(params, xmlAddNewEmployee);
			KronosWFC kronos = sendDataKronos.desglosarXmlKronosResponse(xmlResponse, null);
			kronos.setXmlResponse(xmlResponse);*/
            if (rehire) {
                params.remove("hireDate");
                params.put("customDate", data.getHireDate() != null ? data.getHireDate() : Constants.KR_XMLREQUESTPARAMNOTFOUND);
                xmlRequest = sendDataKronos.crearXmlRequest(params, xmlRecontractEmployee);
            } else {
                xmlRequest = sendDataKronos.crearXmlRequest(params, xmlAddNewEmployee);
            }

            String xmlResponse = sendDataKronos.sendKronosRequest(xmlRequest);
            kronos = sendDataKronos.desglosarXmlKronosResponse(xmlResponse);
            kronos.setXmlRequest(xmlRequest);
            kronos.setXmlResponse(xmlResponse);

            if (kronos != null && kronos.getResponse() != null) {
                return kronos;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String getXmlPlain(Map<String, String> args, String xmlNameTemplate) {

        try {
            SendDataKronosUtil sendDataKronos = new SendDataKronosUtil(strUrl);
            String xmlResponse = sendDataKronos.sendKronosRequest(args, xmlNameTemplate);

            return xmlResponse;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public KronosWFC getLoadPersonality(Long personNum) {
        Map<String, String> params = new HashMap<>();
        try {
            SendDataKronosUtil sendDataKronos = new SendDataKronosUtil(strUrl);
            params.put("username", krUser);
            params.put("password", krPass);
            params.put("personNum", personNum.toString());

            String xmlResponse = sendDataKronos.sendKronosRequest(params, xmlLoadPersonality);
            KronosWFC kronos = sendDataKronos.desglosarXmlKronosResponse(xmlResponse, null);
            kronos.setXmlResponse(xmlResponse);

            if (kronos != null && kronos.getResponse() != null) {
                return kronos;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public KronosWFC getWorkRuleName(Long personNum, Date startDate, Date endDate) {
        Map<String, String> params = new HashMap<>();
        try {
            SendDataKronosUtil sendDataKronos = new SendDataKronosUtil(strUrl);
            params.put("username", krUser);
            params.put("password", krPass);
            params.put("personNum", personNum.toString());
            params.put("startDate", sendDataKronos.formatoFechaKronos(startDate));
            params.put("endDate", sendDataKronos.formatoFechaKronos(endDate));
            String xmlResponse = sendDataKronos.sendKronosRequest(params, xmlGetRuleTransfer);
            KronosWFC kronos = sendDataKronos.desglosarXmlKronosResponse(xmlResponse, params);

            if (kronos != null && kronos.getResponse() != null) {
                return kronos;
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public KronosWFC getGenie(String genieName, String hyperFindQueryName, String timeFramePeriod, boolean hasRange) {
        Map<String, String> params = new HashMap<>();
        try {
            /*****************************************************************************************************
             * Hay que cambiar la URL por el de la variable
             */
//            SendDataKronosUtil sendDataKronos = new SendDataKronosUtil(strUrl);
            SendDataKronosUtil sendDataKronos = new SendDataKronosUtil("https://metalsa.kronos.net/wfc/XmlService");
            params.put("username", krUser);
            params.put("password", krPass);
            params.put("genieName", genieName);
            params.put("hyperFindQueryName", hyperFindQueryName);
            if (hasRange) {
                String strFramePeriod = "<TimeFramePeriod PeriodDateSpan='" + timeFramePeriod + "'/>";
                params.put("timeFramePeriod", strFramePeriod);
            }else{
                String strFramePeriod = "<TimeFramePeriod TimeFrameName='Previous Pay Period'/>";
                params.put("timeFramePeriod", strFramePeriod);
            }

            String xmlRequest = sendDataKronos.crearXmlRequest(params, xmlLoadGenie);
            String xmlResponse = sendDataKronos.sendKronosRequest(xmlRequest);
            KronosWFC kronos = sendDataKronos.desglosarXmlKronosResponse(xmlResponse);
            kronos.setXmlRequest(xmlRequest);
            kronos.setXmlResponse(xmlResponse);

            if (kronos != null && kronos.getResponse() != null) {
                return kronos;
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
