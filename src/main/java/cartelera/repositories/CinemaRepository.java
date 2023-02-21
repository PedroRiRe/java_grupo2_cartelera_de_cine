package cartelera.repositories;

import cartelera.entities.Address;
import cartelera.entities.Cinema;
import cartelera.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {

    Optional<Cinema> findByName(String name);

    List<Cinema> findAllByName(String name);

    List<Cinema> findAllByPhone(String phone);

    List<Cinema> findByNameAndPhone(String name, Address address);

    List<Cinema> findAllByAddressCity(String city);
}