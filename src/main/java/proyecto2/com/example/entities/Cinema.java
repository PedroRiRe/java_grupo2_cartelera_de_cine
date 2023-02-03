package proyecto2.com.example.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "cinema")
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String phone;

    // private Address address;


    public Cinema() {
    }

    public Cinema(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public Cinema setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Cinema setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Cinema setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}