package cartelera.entities;

import cartelera.entities.enums.Classification;
import cartelera.entities.enums.Gender;
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
    private Set<String> actors = new HashSet<>();
    @ElementCollection
    private Set<Gender> genders;

}