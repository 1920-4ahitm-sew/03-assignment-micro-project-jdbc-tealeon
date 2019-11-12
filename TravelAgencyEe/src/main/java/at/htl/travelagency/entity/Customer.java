package at.htl.travelagency.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Customer(){}

    public Customer(String name, int age, String street) {
        super(name, age, street);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
