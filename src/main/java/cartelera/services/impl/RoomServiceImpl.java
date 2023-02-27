package cartelera.services.impl;

import cartelera.entities.Cinema;
import cartelera.entities.Film;
import cartelera.entities.Room;
import cartelera.repositories.RoomRepository;
import cartelera.services.IRoomService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@AllArgsConstructor
@Service
public class RoomServiceImpl implements IRoomService {

    private final RoomRepository roomRepo;

    @Override
    public List<Room> findAll() {
        log.info("findAll");
        return roomRepo.findAll();
    }

    @Override
    public Optional<Room> findById(Long id) {
        log.info("findById {}", id);
        if (id == null || id <= 0) return Optional.empty();
        return roomRepo.findById(id);
    }

    @Override
    public List<Room> findAllByCinemaId(Long id) {
        log.info("findAllByCinemaId {}", id);
        if (id == null || id <= 0) return new ArrayList<>();
        return roomRepo.findAllByCinemaId(id);
    }

    @Override
    public List<Room> findAllByFilmId(Long id) {
        log.info("findAllByFilmId {}", id);
        if (id == null || id <= 0) return new ArrayList<>();
        return roomRepo.findAllByFilmId(id);
    }

    @Override
    public Room save(Room room) {
        return roomRepo.save(room);
    }

    @Override
    public void deleteById(Long id) {
        // desasociar room de cine
        Optional<Room> roomOpt = findById(id);
        if (roomOpt.isPresent()) {
            Room room = roomOpt.get();
            room.setCinema(null);
            room.setFilm(null);
        }
        roomRepo.deleteById(id);
    }

    @Override
    public void deleteAllById(List<Long> ids) {
        roomRepo.deleteAllById(ids);
    }

    @Override
    public void saveAll(List<Room> rooms) {
        roomRepo.saveAll(rooms);
    }

}


