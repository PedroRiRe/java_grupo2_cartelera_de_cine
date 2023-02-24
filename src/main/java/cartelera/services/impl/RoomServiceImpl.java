package cartelera.services.impl;

import cartelera.entities.Cinema;
import cartelera.entities.Room;
import cartelera.repositories.CinemaRepository;
import cartelera.services.IRoomService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Slf4j
@AllArgsConstructor
@Service

public class RoomServiceImpl implements IRoomService {

    private final CinemaRepository roomRepo;

    @Override
    public List<Cinema> findAll() {
        return roomRepo.findAll();
    }

    @Override
    public Optional<Cinema> findById(Long id) {
        return roomRepo.findById(id);
    }

    @Override
    public Room save(Room room) {
        return null;
    }

    @Override
    public Cinema save(Cinema cinema) {
        return roomRepo.save(cinema);
    }

    @Override
    public void deleteById(Long id) {
        roomRepo.deleteById(id);
    }
}

