<?xml version="1.0" ?>
<Kronos_WFC version="1.0">
	<Request Object = "System" Action = "Logon" Username = "${username}" Password = "${password}"/>
	<Request Action = "Update">
      <Personality>
         <Identity>
            <PersonIdentity PersonNumber="${personNumber}"/>
         </Identity>
         <JobAssignmentData>
                <JobAssignment>
                <EmploymentTermAssignments>
                    <EmploymentTermAssignment>    
                        <OriginalStartDate>${osDate}</OriginalStartDate>
                        <Name></Name>
                    </EmploymentTermAssignment>
                </EmploymentTermAssignments>
                </JobAssignment>
            </JobAssignmentData>
      </Personality>
   </Request>
	<Request Object="System" Action="Logoff"/>
</Kronos_WFC>