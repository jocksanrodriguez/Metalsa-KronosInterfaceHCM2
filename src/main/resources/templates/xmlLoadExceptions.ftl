<?xml version="1.0" encoding="UTF-8"?>
<Kronos_WFC version="1.0">
   <Request Object = "System" Action = "Logon" Username = "andres.villanueva" Password = "123456" />
   <Request Action="Load">
   <WFCGenie>
      <HyperFindQueryName>Apodaca</HyperFindQueryName>
      <GenieName>Excepciones Reportes</GenieName>
      <Period>
         <TimeFramePeriod TimeFrameName="Yesterday"/>
      </Period>
   </WFCGenie>
   </Request>
   <Request Object="System" Action="Logoff" />
</Kronos_WFC>