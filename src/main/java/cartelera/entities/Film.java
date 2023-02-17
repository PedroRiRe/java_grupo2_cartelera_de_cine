package cartelera.entities;

import cartelera.entities.enums.Classification;
import cartelera.entities.enums.Gender;
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
@Table(name = "film")
public class Film {
    /*
    crear attributos
    trailer
    poster
    valoración externa
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String title;
    private Integer duration;
    private String director;
    private String country;
    private Classification classification;
    private Byte rating;
    private String music;
    private  String photography;
    private String script;
    private String company;
    @ElementCollection
    @ToString.Exclude
    private Set<String> actors = new HashSet<>();

    @ElementCollection
    @ToString.Exclude
    private Set<Gender> genders;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Film film = (Film) o;
        return id != null && Objects.equals(id, film.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
    private String trailer;

    private String poster;

    private String review;

    @OneToMany(mappedBy = "film", fetch = FetchType.EAGER)
    @ToString.Exclude
    private Set<Room> rooms = new HashSet<>();
}