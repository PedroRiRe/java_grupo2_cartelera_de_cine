package cartelera.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    private String image; // Foto del actor

    // Si quieres asociarle una dirección de forma limpia mediante relaciones JPA:
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @Override
    public String toString() {
        return name + " " + surname;
    }
}

