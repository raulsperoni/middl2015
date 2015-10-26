package uy.mgcoders.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uy.mgcoders.dto.OrdenCompra;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.soap.Addressing;

/**
 * Created by pablo on 10/22/15.
 */

// TODO esto esta pendiente todo!

@Stateless
@WebService
@Addressing(enabled = true, required = true)
public class ServicioRecepcionOrdenCompra {

    @Resource
    WebServiceContext context;

    private static final Logger logger = LoggerFactory.getLogger(ServicioRecepcionOrdenCompra.class);

    @WebMethod
    public void ingresarOrden(@WebParam(name = "ordencompra") OrdenCompra ordenCompra) {
        logger.info("metodo: ingresarOrden");
        logger.info("idOrden...................: " + ordenCompra.getIdOrden());
        logger.info("nroTerfeta................: " + ordenCompra.getNumeroTarjeta());
        logger.info("Productos................: ");
        for(int i = 0; i < ordenCompra.getProductos().size(); i++) {
            logger.info("     idProducto................: " + ordenCompra.getProductos().get(i).getIdProducto());
            logger.info("     cantidad..................: " + ordenCompra.getProductos().get(i).getCantidad());
            logger.info("     precioUnitario............: " + ordenCompra.getProductos().get(i).getPrecioUnitario());
            logger.info(" ");
        }

        // TODO: No habria que retornar un bool que indique si la confirmacion de la orden?

        logger.info("#######");
    }
}
