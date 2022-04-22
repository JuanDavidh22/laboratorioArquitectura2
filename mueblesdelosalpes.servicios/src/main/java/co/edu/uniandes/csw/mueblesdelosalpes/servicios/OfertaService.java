/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniandes.csw.mueblesdelosalpes.servicios;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Mueble;
import co.edu.uniandes.csw.mueblesdelosalpes.dto.Oferta;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioOfertaMockLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author juanc
 */

@Path("/Oferta")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class OfertaService {
    
    
    @EJB
    private IServicioOfertaMockLocal ofertaEJB;
    
    @POST
    @Path("agregar/")
    public List<Oferta> agregarOfertas(List<Oferta> mb) {
        for (Oferta oferta : mb) {
            ofertaEJB.agregarOferta(oferta);
        }
        return mb;
    }
    
    @GET
    @Path("ofertas/")
    public List<Oferta> getTodasLasOfertas() {
        return ofertaEJB.getOfertas();
    }
    
//    @GET
//    @Path("muebles/")
//    public List<Mueble> getTodosLosMuebles() {
//        return catalogoEjb.darMuebles();
//    }
}
