<?xml version="1.0" encoding="UTF-8"?>
<Kronos_WFC version="1.0">
   <Request Object = "System" Action = "Logon" Username = "${username}" Password = "${password}" />
   <Request Action="Load">
   <WFCGenie>
      <HyperFindQueryName>${hyperFindQueryName}</HyperFindQueryName>
      <GenieName>${genieName}</GenieName>
      <Period>
         ${timeFramePeriod}
      </Period>
   </WFCGenie>
   </Request>
   <Request Object="System" Action="Logoff" />
</Kronos_WFC>