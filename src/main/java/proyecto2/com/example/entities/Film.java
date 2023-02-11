package proyecto2.com.example.entities;

import jakarta.persistence.*;
import lombok.*;

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
    private Set<String> actors;
    @ElementCollection
    private Set<Gender> genders;

}