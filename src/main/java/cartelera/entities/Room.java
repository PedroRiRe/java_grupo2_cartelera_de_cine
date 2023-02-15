package cartelera.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
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
    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;
    private Integer capacity;
    private Boolean active;
    private LocalDate premiere;
    @ElementCollection
    private Set<LocalTime> schedules;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="cinema_id") // nullable
    private Cinema cinema;

}