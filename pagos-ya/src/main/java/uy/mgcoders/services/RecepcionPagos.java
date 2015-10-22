package uy.mgcoders.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uy.mgcoders.dto.Pago;
import uy.mgcoders.ejb.ProcesarPagosBean;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * Created by pablo on 10/20/15.
 */
@Path("pagos")
@Stateless
public class RecepcionPagos {

    @EJB
    ProcesarPagosBean procesarPagosBean;

    private static final Logger logger = LoggerFactory.getLogger(RecepcionPagos.class);

    @GET
    @Path("/ping/{query}")
    public Response ping(@PathParam("query") String query) {
        logger.info("metodo: ping ");
        logger.info("query " + query);

        int result = 1;
        return Response.ok(result, MediaType.APPLICATION_JSON).build();
    }

    @POST
    @Path("/recepcion")
    @Consumes("application/json")
    public Response recibirPago(Pago pago) {
        long result = procesarPagosBean.procesarPago(pago);
        return Response.ok(result, MediaType.APPLICATION_JSON).build();
    }

}
