<?xml version="1.0" ?>
<Kronos_WFC version="1.0">
	<Request Object = "System" Action = "Logon" Username = "${username}" Password = "${password}" />
	<Request Action="Load">
		<Schedule QueryDateSpan="${startDate}-${endDate}">
		  <Employees>
		     <PersonIdentity PersonNumber="${personNum}"/>
		  </Employees>
		</Schedule>
	</Request>
   <Request Object="System" Action="Logoff" />
</Kronos_WFC>