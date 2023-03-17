package cartelera.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String image;

    @Column(nullable = false)
    private String cif;

    @Column(nullable = false)
    private String name;

    @Column()
    private String url;

    @Column()
    private String twitter;

    @Column()
    private String linkedIn;

    @Column()
    private String facebook;

    @Column()
    private String instagram;

    @Column()
    private String email;

    @Column()
    private String phone;

    @OneToOne(cascade = CascadeType.REMOVE, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "cinema", cascade = CascadeType.DETACH, orphanRemoval = true, fetch = FetchType.LAZY)
    private Set<Room> rooms = new HashSet<>();

    @Override
    public String toString() {
        return name + " - " + cif;
    }
}