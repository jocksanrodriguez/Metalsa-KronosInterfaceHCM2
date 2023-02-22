
package com.metalsa.api.wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "fault1", targetNamespace = "http://xmlns.oracle.com/oxp/service/v2")
public class OperationFailedException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private OperationFailedException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public OperationFailedException_Exception(String message, OperationFailedException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public OperationFailedException_Exception(String message, OperationFailedException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.metalsa.interfaz.wsdl.hcm.reportes.kronos.OperationFailedException
     */
    public OperationFailedException getFaultInfo() {
        return faultInfo;
    }

}
