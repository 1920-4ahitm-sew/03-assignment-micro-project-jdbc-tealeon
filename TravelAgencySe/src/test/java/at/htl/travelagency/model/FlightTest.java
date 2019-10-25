package at.htl.travelagency.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class FlightTest{

    static EntityManager em;

    @BeforeAll
    private static void init() {
        em = Persistence
                .createEntityManagerFactory("myPU")
                .createEntityManager();

    }

    @Test
    void test01DatabaseConnection() {
        System.out.println("IT WORKS!");
        Flight outboundFlight = new Flight("LNZ", "LAX", "25.10.2019");
        Flight returnFlight = new Flight("LAX", "LNZ", "29.10.2019");

        em.getTransaction().begin();
        em.persist(outboundFlight);
        em.persist(returnFlight);
        returnFlight.setDate("5.11.2019");
        em.getTransaction().commit();
    }

    @Test
    void test02readOneFlight() {
        Flight outboundFlight = em.find(Flight.class,1L);
        assertThat(outboundFlight.getDeparture(),is("LNZ"));
        assertThat(outboundFlight.getDestination(),is("LAX"));
    }

}