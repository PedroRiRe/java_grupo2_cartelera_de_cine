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
public class Director {

    @Id
    private String document; // Clave primaria de tipo texto (ej. DNI/Pasaporte) sin autoincremento

    private String name;

    private String surname;

    private String image;

    // Relación ManyToMany recomendada con Film para aprovechar JPA
    @ManyToMany(mappedBy = "directors")
    private Set<Film> films = new HashSet<>();

    @Override
    public String toString() {
        return name + " " + surname;
    }
}