package cartelera.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String address; // ( calle, número, escalera, piso )
    @Column(length = 6)
    private String postalCode;
    private String city;
    private String country;
}