package cartelera.services;

import cartelera.entities.Room;

import java.util.List;
import java.util.Optional;

public interface IRoomService {

    List<Room> findAll();

    Optional<Room> findById(Long id);

    boolean existsById(Long id);

    List<Room> findAllByCinemaId(Long id);

    List<Room> findAllByFilmId(Long id);

    Room save(Room room);

    void deleteById(Long id);

    void deleteAllById(List<Long> ids);

    void saveAll(List<Room> rooms);
}
