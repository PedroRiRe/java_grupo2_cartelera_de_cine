package proyecto2.com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Gender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;
    private Integer minAllowedAge;

    public Gender() {
    }

    public Gender(Long id, String name, Integer minAllowedAge) {
        this.id = id;
        this.name = name;
        this.minAllowedAge = minAllowedAge;
    }

    public Long getId() {
        return id;
    }

    public Gender setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Gender setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getMinAllowedAge() {
        return minAllowedAge;
    }

    public Gender setMinAllowedAge(Integer minAllowedAge) {
        this.minAllowedAge = minAllowedAge;
        return this;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", minAllowedAge=" + minAllowedAge +
                '}';
    }
}
