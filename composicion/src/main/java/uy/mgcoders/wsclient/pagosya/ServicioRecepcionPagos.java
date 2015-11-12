
package uy.mgcoders.wsclient.pagosya;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServicioRecepcionPagos", targetNamespace = "http://services.mgcoders.uy/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioRecepcionPagos {


    /**
     * 
     * @param recepcionPago
     * @return
     *     returns uy.mgcoders.wsclient.pagosya.ConfirmacionPago
     */
    @WebMethod
    @WebResult(partName = "return")
    public ConfirmacionPago recepcionPago(
        @WebParam(name = "recepcionPago", partName = "recepcionPago")
        RecepcionPago recepcionPago);

}
