<?xml version="1.0" ?>
<Kronos_WFC version="1.0">
	<Request Object = "System" Action = "Logon" Username = "${username}" Password = "${password}" />
	<Request Action="Update">
		<Personality>
		 <PersonInformationData>
		    <PersonInformation>
		       <AccessAssignmentData>
		          <AccessAssignment>
		             <AccessProfileName>${accProfName}</AccessProfileName>
		             <PreferenceProfileName>${prefProfName}</PreferenceProfileName>
		             <TimeEntryTypeName>${timeEnTyName}</TimeEntryTypeName>
		             <NotificationProfileName>${notifProfName}</NotificationProfileName>
		             <LocalePolicyName>${locPolName}</LocalePolicyName>
		             <ProfessionalPayCodeName>${professPayCodName}</ProfessionalPayCodeName>
		          </AccessAssignment>
		       </AccessAssignmentData>
		       <BadgeAssignments>
		          <BadgeAssignment>
		             <BadgeNumber>${badgeNum}</BadgeNumber>
		             <EffectiveDate>${effectiveDate}</EffectiveDate>
		          </BadgeAssignment>
		       </BadgeAssignments>
		       <EmailAddresses>
		          <EmailAddress ContactTypeName="Work" Address="${emailAd}" />
		       </EmailAddresses>
		       <CustomDataList>
		          <CustomData Text="${supervName}" CustomDataTypeName="Coordinador" />
		          <CustomData Text="${compName}" CustomDataTypeName="Compania" />
		       </CustomDataList>
		       <EmploymentStatusList>
		          <EmploymentStatus>
		             <EffectiveDate>${effectiveDate}</EffectiveDate>
		             <EmploymentStatusName>${employmentStatusName}</EmploymentStatusName>
		          </EmploymentStatus>
		       </EmploymentStatusList>
		       <PersonAuthenticationTypes>
		          <PersonAuthenticationType ActiveFlag="true" AuthenticationTypeName="${authTypName}" />
		       </PersonAuthenticationTypes>
		       <PersonData>
		          <Person LastName="${lastName}" FirstName="${firstName}" HireDate="${hireDate}" PersonNumber="${personNumber}" FingerRequiredFlag="True">
                            <AccrualProfileEffectiveDate>${effectiveDate}</AccrualProfileEffectiveDate>
                            <AccrualProfileName>${accrualProfileName}</AccrualProfileName>
                          </Person>
		       </PersonData>
		       <PersonLicenseTypes>
		          <PersonLicenseType>
		             <ActiveFlag>${actFlagLic}</ActiveFlag>
		             <LicenseTypeName>1</LicenseTypeName>
		          </PersonLicenseType>
		          <PersonLicenseType>
		             <ActiveFlag>${actFlagLic}</ActiveFlag>
		             <LicenseTypeName>2</LicenseTypeName>
		          </PersonLicenseType>
		          <PersonLicenseType>
		             <ActiveFlag>${actFlagLic}</ActiveFlag>
		             <LicenseTypeName>22</LicenseTypeName>
		          </PersonLicenseType>
		       </PersonLicenseTypes>
		       <TelephoneNumbers>
		          <TelephoneNumber>
		             <ContactTypeName>Phone 1</ContactTypeName>
		             <PhoneNumber>${phoneHome}</PhoneNumber>
		          </TelephoneNumber>
		          <TelephoneNumber>
		             <ContactTypeName>Phone 2</ContactTypeName>
		             <PhoneNumber>${phoneCell}</PhoneNumber>
		          </TelephoneNumber>
		       </TelephoneNumbers>
		       <UserAccountStatusList>
		          <UserAccountStatus>
		             <Identity>
		                <PersonIdentity>
		                   <PersonNumber>${personNumber}</PersonNumber>
		                </PersonIdentity>
		             </Identity>
		             <UserAccountStatusName>1</UserAccountStatusName>
		          </UserAccountStatus>
		       </UserAccountStatusList>
		    </PersonInformation>
		 </PersonInformationData>
		 <JobAssignmentData>
		    <JobAssignment>
		       <JobAssignmentDetailsData>
		          <JobAssignmentDetails SupervisorName="${supervName}" PayRuleName="${payRuleName}" TimeZoneName="13008" DeviceGroupName="${deviceGrpName}" />
		       </JobAssignmentDetailsData>
		       <PrimaryLaborAccounts>
		          <PrimaryLaborAccount LaborAccountName="${laborAccName}" EffectiveDate="${effectiveDate}" />
		       </PrimaryLaborAccounts>
		       <EmploymentTermAssignments>
		          <EmploymentTermAssignment>
		             <Name>${empTermAssign}</Name>
		             <StartDate>${startDate}</StartDate>
		             <EndDate>${endDate}</EndDate>
		          </EmploymentTermAssignment>
		       </EmploymentTermAssignments>
		    </JobAssignment>
		 </JobAssignmentData>
		 <UserData>
		    <User>
		       <Identity>
		          <PersonIdentity>
		             <PersonNumber>${personNumber}</PersonNumber>
		          </PersonIdentity>
		       </Identity>
		       <UserAccountData>
		          <UserAccount>
		             <UserName>${userN}</UserName>
		             <UserPassword>${userPass}</UserPassword>
		          </UserAccount>
		       </UserAccountData>
		    </User>
		 </UserData>
		 <Identity>
		    <PersonIdentity>
		       <PersonNumber>${personNumber}</PersonNumber>
		    </PersonIdentity>
		 </Identity>
		</Personality>
		</Request>
		<Request Action="Add">
		<PersonCascadeProfileAssignment>
		 <CascadeProfile>MX-VACACIONES DOMINO</CascadeProfile>
		 <Person>
		    <PersonIdentity>
		       <PersonNumber>${personNumber}</PersonNumber>
		    </PersonIdentity>
		 </Person>
		</PersonCascadeProfileAssignment>
		</Request>
		<Request Action="UpdateOnly">
		<WorkflowAccessAssignment>
		 <EmployeeWorkflowProfileName>All Process Templates</EmployeeWorkflowProfileName>
		 <Identity>
		    <PersonIdentity>
		       <PersonNumber>${personNumber}</PersonNumber>
		    </PersonIdentity>
		 </Identity>
		 <ManagerWorkflowProfileName>All Process Templates</ManagerWorkflowProfileName>
		</WorkflowAccessAssignment>
	</Request>
	<Request Object="System" Action="Logoff"/>
</Kronos_WFC>