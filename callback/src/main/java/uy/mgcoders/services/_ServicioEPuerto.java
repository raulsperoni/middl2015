package uy.mgcoders.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by pablo on 10/22/15.
 */
@Stateless
@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class _ServicioEPuerto {

    private static final Logger logger = LoggerFactory.getLogger(_ServicioEPuerto.class);

    @WebMethod
    public _ConfirmacionOrden colocarOrden(@WebParam(name = "identificadorCompra") String identificadorCompra,@WebParam(name = "identificadorProducto")  long identificadorProducto,@WebParam(name = "cantidad")  int cantidad) {
        logger.info("#######");
        return new _ConfirmacionOrden();
    }

    @WebMethod
    public String anularOrden(@WebParam(name = "identificadorReserva") String identificadorReserva) {
        logger.info("#######");
        return "";
    }

}