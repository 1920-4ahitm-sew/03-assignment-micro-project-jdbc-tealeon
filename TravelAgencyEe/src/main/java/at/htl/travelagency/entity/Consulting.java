package at.htl.travelagency.entity;

import javax.persistence.*;

@Entity
public class Consulting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Assistant assistant;

    @ManyToOne
    private Customer customer;

    public Consulting(){}

    public Consulting(Assistant assistant, Customer customer) {
        this.assistant = assistant;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public Assistant getAssistant() {
        return assistant;
    }

    public void setAssistant(Assistant assistant) {
        this.assistant = assistant;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
