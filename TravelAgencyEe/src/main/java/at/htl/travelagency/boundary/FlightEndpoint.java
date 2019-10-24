package at.htl.travelagency.boundary;

import at.htl.travelagency.entity.Flight;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("flight")
public class FlightEndpoint {
    @PersistenceContext
    EntityManager em;

    @PostConstruct
    public void init(){
        System.err.println("***FlightEndPoint created***");
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Flight getFlight(@PathParam("id") long id){
        return em.find(Flight.class, id);
    }
}
