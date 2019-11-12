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
    private int loyalPoints;

    public Customer(){}

    public Customer(String name, int age, String city, int loyalPoints) {
        super(name, age, city);
        this.loyalPoints = loyalPoints;
    }

    public int getLoyalPoints() {
        return loyalPoints;
    }

    public void setLoyalPoints(int loyalPoints) {
        this.loyalPoints = loyalPoints;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
