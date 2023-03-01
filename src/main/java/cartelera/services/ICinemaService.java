package cartelera.services;

import cartelera.entities.Cinema;

import java.util.List;
import java.util.Optional;

public interface ICinemaService {

    List<Cinema> findAll();

    Optional<Cinema> findById(Long id);

    boolean existsById(Long id);

    Cinema save(Cinema cinema);

    void deleteById(Long id);

    Optional<Cinema> findByIdWithRooms(Long id);
}
