package cartelera.services.impl;

import cartelera.entities.Cinema;
import cartelera.entities.Room;
import cartelera.repositories.RoomRepository;
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

    private final RoomRepository roomRepo;
    private Room room;

    @Override
    public List<Room> findAll() {
        return roomRepo.findAll();
    }

    @Override
    public Optional<Room> findById(Long id) {
        return roomRepo.findById(id);
    }

    @Override
    public Room save(Room Room) {
        return roomRepo.save(room);
    }

    @Override
    public Cinema save(Cinema cinema) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        roomRepo.deleteById(id);
    }
}

