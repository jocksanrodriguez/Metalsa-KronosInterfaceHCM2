<?xml version="1.0" ?>
<Kronos_WFC version="1.0">
	<Request Object = "System" Action = "Logon" Username = "${username}" Password = "${password}" />
	<Request Action="Load">
		<Personality>
			<Identity>
				<PersonIdentity PersonNumber="${personNum}"/>
			</Identity>
		</Personality>
	</Request>
	<Request Object="System" Action="Logoff"/>
</Kronos_WFC>