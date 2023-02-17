package cartelera.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private Byte roomNumber;

    private Integer capacity;

    private Boolean active;

    private LocalDate premiere;

    @ElementCollection
    @ToString.Exclude
    private Set<LocalTime> schedules = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;

    @ManyToOne
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;
}