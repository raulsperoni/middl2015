
package org.fing.middleware.serviceVentaEntradas;

import java.math.BigDecimal;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IServicioVentaDeEntradas", targetNamespace = "http://services.middleware.fing.org/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IServicioVentaDeEntradas {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String echo(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns org.fing.middleware.serviceVentaEntradas.WsResult
     */
    @WebMethod
    @WebResult(partName = "return")
    public WsResult cobrar(
        @WebParam(name = "arg0", partName = "arg0")
        short arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        BigDecimal arg2,
        @WebParam(name = "arg3", partName = "arg3")
        XMLGregorianCalendar arg3);

}