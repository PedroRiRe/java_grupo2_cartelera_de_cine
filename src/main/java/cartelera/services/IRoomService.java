package cartelera.services;

import cartelera.entities.Room;

import java.util.List;
import java.util.Optional;

public interface IRoomService {

    List<Room> findAll();

    Optional<Room> findById(Long id);

    List<Room> findAllByCinemaId(Long id);
}
