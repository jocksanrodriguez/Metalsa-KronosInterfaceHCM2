<?xml version="1.0" encoding="UTF-8"?>
<Kronos_WFC version="1.0">
   <Request Object = "System" Action = "Logon" Username = "${username}" Password = "${password}" />
   <Request Action="AddOnly">
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