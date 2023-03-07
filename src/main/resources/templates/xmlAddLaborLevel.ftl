<?xml version="1.0"?>
<Kronos_WFC version="1.0">
  <Request Object = "System" Action = "Logon" Username = "${username}" Password = "${password}" />
    <Request Action="Update">
      <LaborLevelEntry>
        <Description>${description}</Description>
        <InactiveFlag>False</InactiveFlag>
        <LaborLevelDefinitionName>${laborLevelDefinitionName}</LaborLevelDefinitionName>
        <LaborLevelEntryName>${laborLevelEntryName}</LaborLevelEntryName>
      </LaborLevelEntry>
    </Request>
  <Request Object="System" Action="Logoff"/>
</Kronos_WFC>