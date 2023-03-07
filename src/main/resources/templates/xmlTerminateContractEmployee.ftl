<?xml version="1.0" ?>
<Kronos_WFC version="1.0">
	<Request Object = "System" Action = "Logon" Username = "${username}" Password = "${password}" />
	<Request Action="Update">
      <Personality>
         <Identity>
            <PersonIdentity PersonNumber="${personNumber}" />
         </Identity>
         <PersonInformationData>
            <PersonInformation>
               <PersonLicenseTypes>
                  <PersonLicenseType>
                     <ActiveFlag>False</ActiveFlag>
                     <LicenseTypeName>1</LicenseTypeName>
                  </PersonLicenseType>
                  <PersonLicenseType>
                     <ActiveFlag>False</ActiveFlag>
                     <LicenseTypeName>2</LicenseTypeName>
                  </PersonLicenseType>
                  <PersonLicenseType>
                     <ActiveFlag>False</ActiveFlag>
                     <LicenseTypeName>22</LicenseTypeName>
                  </PersonLicenseType>
               </PersonLicenseTypes>
               <EmploymentStatusList>
                  <EmploymentStatus>
                     <EffectiveDate>${effectiveDate}</EffectiveDate>
                     <EmploymentStatusName>3</EmploymentStatusName>
                  </EmploymentStatus>
               </EmploymentStatusList>
               <UserAccountStatusList>
                  <UserAccountStatus EffectiveDate="${effectiveDate}" ExpirationDate="01/01/3000" UserAccountStatusName="Terminated" />
               </UserAccountStatusList>
            </PersonInformation>
         </PersonInformationData>
      </Personality>
   </Request>
	<Request Object="System" Action="Logoff"/>
</Kronos_WFC>