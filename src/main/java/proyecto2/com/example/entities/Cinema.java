package proyecto2.com.example.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "cinema")
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String phone;
    //private Address address;
    private Integer capacity;
    private Boolean active;
    private LocalTime open;
    @ElementCollection
    private Set<String> rooms = new HashSet<>();


    public Long getId() {
        return id;
    }

    public Cinema setId(Long id) {
        this.id = id;
        return this;
    }

}