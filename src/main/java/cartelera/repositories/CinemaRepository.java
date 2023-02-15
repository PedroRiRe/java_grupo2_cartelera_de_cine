package cartelera.repositories;

import cartelera.entities.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {
    Optional<Cinema> findByName(String name);


    List<Cinema> findAllByName(String name);
    List<Cinema> findByNameAndPhone(String name, String phone);

    List<Cinema> findAllByPhone(String phone);
}