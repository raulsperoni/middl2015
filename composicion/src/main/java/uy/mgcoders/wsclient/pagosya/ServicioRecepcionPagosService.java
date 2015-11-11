
package uy.mgcoders.wsclient.pagosya;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServicioRecepcionPagosService", targetNamespace = "http://services.mgcoders.uy/", wsdlLocation = "http://localhost:8181/esb/pagosya?wsdl")
public class ServicioRecepcionPagosService
    extends Service
{

    private final static URL SERVICIORECEPCIONPAGOSSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICIORECEPCIONPAGOSSERVICE_EXCEPTION;
    private final static QName SERVICIORECEPCIONPAGOSSERVICE_QNAME = new QName("http://services.mgcoders.uy/", "ServicioRecepcionPagosService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8181/esb/pagosya?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIORECEPCIONPAGOSSERVICE_WSDL_LOCATION = url;
        SERVICIORECEPCIONPAGOSSERVICE_EXCEPTION = e;
    }

    public ServicioRecepcionPagosService() {
        super(__getWsdlLocation(), SERVICIORECEPCIONPAGOSSERVICE_QNAME);
    }

    public ServicioRecepcionPagosService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIORECEPCIONPAGOSSERVICE_QNAME, features);
    }

    public ServicioRecepcionPagosService(URL wsdlLocation) {
        super(wsdlLocation, SERVICIORECEPCIONPAGOSSERVICE_QNAME);
    }

    public ServicioRecepcionPagosService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIORECEPCIONPAGOSSERVICE_QNAME, features);
    }

    public ServicioRecepcionPagosService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioRecepcionPagosService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioRecepcionPagos
     */
    @WebEndpoint(name = "ServicioRecepcionPagosPort")
    public ServicioRecepcionPagos getServicioRecepcionPagosPort() {
        return super.getPort(new QName("http://services.mgcoders.uy/", "ServicioRecepcionPagosPort"), ServicioRecepcionPagos.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioRecepcionPagos
     */
    @WebEndpoint(name = "ServicioRecepcionPagosPort")
    public ServicioRecepcionPagos getServicioRecepcionPagosPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.mgcoders.uy/", "ServicioRecepcionPagosPort"), ServicioRecepcionPagos.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIORECEPCIONPAGOSSERVICE_EXCEPTION!= null) {
            throw SERVICIORECEPCIONPAGOSSERVICE_EXCEPTION;
        }
        return SERVICIORECEPCIONPAGOSSERVICE_WSDL_LOCATION;
    }

}
