package cartelera.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Setter
@Builder
@Entity
public class Screenwriter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String name;

    private Integer capacity;

    private Boolean active;

    private LocalDate premiere;
}


