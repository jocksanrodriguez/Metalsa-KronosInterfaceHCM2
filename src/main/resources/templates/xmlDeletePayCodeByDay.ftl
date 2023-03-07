<?xml version="1.0" encoding="UTF-8"?>
<Kronos_WFC version="1.0">
   <Request Object = "System" Action = "Logon" Username = "${username}" Password = "${password}"/>
   <Request Action = "Delete">
      <PayCodeEdit>
         <AmountInTimeOrCurrency>1</AmountInTimeOrCurrency>
         <Date>${date}</Date>
         <Employee>
            <PersonIdentity>
               <PersonNumber>${personNum}</PersonNumber>
            </PersonIdentity>
         </Employee>
         <PayCodeName>${payCodeName}</PayCodeName>
      </PayCodeEdit>
   </Request>
   <Request Object="System" Action="Logoff" />
</Kronos_WFC>
<!--MX-INC-MATERNIDAD-->
<!--MX-INC-ENFERMEDAD GENERAL-->
<!--MX-INC-RIESGO DE TRABAJO_IMSS-->

<!--el formato de fecha para kronos debe estar en inglés, al menos para el usuario WEBSVC-->