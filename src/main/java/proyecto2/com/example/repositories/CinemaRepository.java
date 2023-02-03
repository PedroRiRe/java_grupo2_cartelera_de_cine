package proyecto2.com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto2.com.example.entities.Cinema;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {
}