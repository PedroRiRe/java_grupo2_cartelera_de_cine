package cartelera.services;

import cartelera.entities.Cinema;
import cartelera.entities.Room;

import java.util.List;
import java.util.Optional;

public interface IRoomService {

    List<Cinema> findAll();

    Optional<Cinema> findById(Long id);

    Room save(Room room);

    Cinema save(Cinema cinema);

    void deleteById(Long id);
}
