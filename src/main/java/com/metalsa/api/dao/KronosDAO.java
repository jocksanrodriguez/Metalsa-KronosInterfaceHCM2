package com.metalsa.api.dao;

import com.metalsa.api.model.kronos.EmployeeData;
import com.metalsa.api.model.kronos.KronosWFC;

import java.util.Date;
import java.util.Map;

public interface KronosDAO {

    KronosWFC insertPayCode(Long personNum, Date dayDate, String payCodeName);

    KronosWFC deleteLaborLevel(String laborLevelName, String laborLevelType);

    KronosWFC deletePayCodeByDay(Long personNum, Date dayDate, String payCodeName);

    KronosWFC insertAbsence(Long personNum, Date dayDate, String payCodeName);

    KronosWFC insertAbsence(Long personNum, Date dayDate, String payCodeName, String commentText, String noteText);

    KronosWFC getPayCodeNameByDay(Long personNum, Date dayDate);

    KronosWFC addLaborLevel(String description, String laborLevelName, String laborLevelType);

    KronosWFC deleteEmploymentTerms(Long personNum, Date originalStartDate);

    KronosWFC changeDataEmployee(EmployeeData data);

    KronosWFC terminateContractEmployee(Long personNum, String effectiveDate);

    KronosWFC addNewEmployee(EmployeeData data, boolean rehire);

    String getXmlPlain(Map<String, String> args, String xmlNameTemplate);

    KronosWFC getLoadPersonality(Long personNum);

    KronosWFC getWorkRuleName(Long personNum, Date startDate, Date endDate);

    KronosWFC getGenieExceptions();

    KronosWFC getGenie(String genieName, String hyperFindQueryName, String timeFramePeriod, boolean hasRange);
}
