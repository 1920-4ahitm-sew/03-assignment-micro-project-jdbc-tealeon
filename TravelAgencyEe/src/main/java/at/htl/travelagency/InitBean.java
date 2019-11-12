package at.htl.travelagency;

import at.htl.travelagency.entity.*;

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
        em.persist(new Flight("LNZ", "LAX", "25.10.2019"));
        em.persist(new Flight("LAX", "LNZ", "29.10.2019"));

        em.persist(new Customer("Leon", "Linz", 0));
        em.persist(new Assistant("Simon", "Leonding"));

        em.persist(new Consulting(
                em.find(Assistant.class, 1L),
                em.find(Customer.class, 1L)
        ));
    }
}
