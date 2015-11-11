
package uy.mgcoders.wsclient.epuerto;

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
@WebServiceClient(name = "ServicioEPuertoService", targetNamespace = "http://services.mgcoders.uy/", wsdlLocation = "http://localhost:8181/esb/epuerto?wsdl")
public class ServicioEPuertoService
    extends Service
{

    private final static URL SERVICIOEPUERTOSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICIOEPUERTOSERVICE_EXCEPTION;
    private final static QName SERVICIOEPUERTOSERVICE_QNAME = new QName("http://services.mgcoders.uy/", "ServicioEPuertoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8181/esb/epuerto?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOEPUERTOSERVICE_WSDL_LOCATION = url;
        SERVICIOEPUERTOSERVICE_EXCEPTION = e;
    }

    public ServicioEPuertoService() {
        super(__getWsdlLocation(), SERVICIOEPUERTOSERVICE_QNAME);
    }

    public ServicioEPuertoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOEPUERTOSERVICE_QNAME, features);
    }

    public ServicioEPuertoService(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOEPUERTOSERVICE_QNAME);
    }

    public ServicioEPuertoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOEPUERTOSERVICE_QNAME, features);
    }

    public ServicioEPuertoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioEPuertoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioEPuerto
     */
    @WebEndpoint(name = "ServicioEPuertoPort")
    public ServicioEPuerto getServicioEPuertoPort() {
        return super.getPort(new QName("http://services.mgcoders.uy/", "ServicioEPuertoPort"), ServicioEPuerto.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioEPuerto
     */
    @WebEndpoint(name = "ServicioEPuertoPort")
    public ServicioEPuerto getServicioEPuertoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.mgcoders.uy/", "ServicioEPuertoPort"), ServicioEPuerto.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOEPUERTOSERVICE_EXCEPTION!= null) {
            throw SERVICIOEPUERTOSERVICE_EXCEPTION;
        }
        return SERVICIOEPUERTOSERVICE_WSDL_LOCATION;
    }

}
