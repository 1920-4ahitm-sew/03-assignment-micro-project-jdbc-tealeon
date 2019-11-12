package at.htl.travelagency.boundary;

import at.htl.travelagency.entity.Consulting;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("")
public class DatabaseEndpoint {
    @PersistenceContext
    EntityManager em;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response showConsulting() {
        Consulting c = em.find(Consulting.class, 1L);
        return Response
                .ok(c)
                .build();

    }

}
