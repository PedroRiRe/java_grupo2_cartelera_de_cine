package cartelera.entities;

import jakarta.persistence.*;
import lombok.*;
import org.jetbrains.annotations.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@NotNull
@Builder
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String image;

    @Column()
    private String street; // ( calle, número, escalera, piso )

    @Column(length = 6)
    private String postalCode;

    private String city;

    private String country;

    @Override
    public String toString() {
        return street + ", " + postalCode + " - " + city;
    }
}