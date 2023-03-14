package cartelera.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String document;

    private String name;

    private String surname;

    private String movies;

    private String image;


}

