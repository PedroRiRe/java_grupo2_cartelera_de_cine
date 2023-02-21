package cartelera.services.impl;

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
    public Room save(Room room) {
        return roomRepo.save(room);

    }
}


