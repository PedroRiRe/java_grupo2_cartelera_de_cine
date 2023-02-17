package cartelera.entities;

import jakarta.persistence.*;
import lombok.*;

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
    @Column(unique = true, nullable = false)
    private String cif;
    @Column(unique = true, nullable = false)
    private String name;
    @Column(unique = true)
    private String url;
    @Column(unique = true)
    private String twitter;
    @Column(unique = true)
    private  String linkedIn;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String phone;

    @OneToOne
    // @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "cinema", fetch = FetchType.EAGER)
    @ToString.Exclude
    @ElementCollection
    private Set<Room> rooms;
}