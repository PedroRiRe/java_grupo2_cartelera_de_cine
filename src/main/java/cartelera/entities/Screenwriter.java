package cartelera.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
public class Screenwriter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    private String image;

    // Relación ManyToMany con Film para enlazar los guiones a las películas
    @ManyToMany(mappedBy = "screenwriters") // (Asegúrate de añadir también este lado en Film si lo usas)
    @ToString.Exclude
    private Set<Film> films = new HashSet<>();

    @Override
    public String toString() {
        return name + " " + surname;
    }
}

