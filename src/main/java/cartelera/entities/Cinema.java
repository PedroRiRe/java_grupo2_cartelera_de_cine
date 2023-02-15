package cartelera.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.HashSet;
import java.util.Objects;
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
    private String twiter;
    @Column(unique = true)
    private  String linkedint;

    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String phone;
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy="cinema")
    @ToString.Exclude
    private Set<Room> rooms = new HashSet<>();

    public void addRoom(Room room) {
        rooms.add(room);
        room.setCinema(this);
    }
    public void removeRoom(Room room) {
        rooms.remove(room);
        room.setCinema(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Cinema cinema = (Cinema) o;
        return id != null && Objects.equals(id, cinema.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}