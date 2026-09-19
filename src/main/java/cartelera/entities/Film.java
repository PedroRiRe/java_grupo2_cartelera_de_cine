package cartelera.entities;

import cartelera.entities.enums.Classification;
import cartelera.entities.enums.Gender;
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
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Integer duration;

    private Integer year;

    private String country;

    @Enumerated(EnumType.STRING)
    private Classification classification;

    private Byte rating;

    private String music;

    private String photography;

    private String company;

    private String trailer;

    private String poster;

    @Column(columnDefinition = "TEXT")
    private String synopsis;

    // Relación ManyToMany con Director (si decides usar la entidad Director)
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "film_director",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "director_document")
    )
    private Set<Director> directors = new HashSet<>();

    // Relación ManyToMany con Actor
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "film_actor",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id")
    )
    private Set<Actor> actors = new HashSet<>();

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<Gender> genders = new HashSet<>();

    // Cambiado a LAZY por buenas prácticas de rendimiento
    @OneToMany(mappedBy = "film", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Room> rooms = new HashSet<>();

    @Override
    public String toString() {
        return "«" + title + "» (" + year + ')';
    }
}