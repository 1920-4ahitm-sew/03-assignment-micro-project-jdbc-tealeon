package at.htl.travelagency.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Assistant extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Assistant(){}

    public Assistant(String name, int age, String city) {
        super(name, age, city);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
