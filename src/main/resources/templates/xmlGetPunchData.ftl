<?xml version="1.0" ?>
<Kronos_WFC version="1.0">
<Request Object = "System" Action = "Logon" Username = "${username}" Password = "${password}" />
<Request Action="Load">
    <Timesheet>
      <Employee>
         <PersonIdentity>
            <PersonNumber>${personNum}</PersonNumber>
         </PersonIdentity>
      </Employee>
      <Period>
         <TimeFramePeriod>
            <PeriodDateSpan>${startDateSpan} - ${endDateSpan}</PeriodDateSpan>
            <TimeFrameName>9</TimeFrameName>
         </TimeFramePeriod>
      </Period>
    </Timesheet>
</Request>
<Request Object="System" Action="Logoff"/>
</Kronos_WFC>