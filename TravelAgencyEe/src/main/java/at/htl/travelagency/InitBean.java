package at.htl.travelagency;

import at.htl.travelagency.entity.Flight;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Date;

@ApplicationScoped
@Transactional
public class InitBean {
    @PersistenceContext
    EntityManager em;

    public void init(@Observes @Initialized(ApplicationScoped.class) Object init){
        System.out.println("IT WORKS!");
        Flight outboundFlight = new Flight("LNZ", "LAX", "25.10.2019");
        Flight returnFlight = new Flight("LAX", "LNZ", "29.10.2019");
        em.persist(outboundFlight);
        em.persist(returnFlight);
    }
}
