package cartelera.services.impl;

import cartelera.entities.Room;
import cartelera.entities.Screenwriter;
import cartelera.repositories.RoomRepository;
import cartelera.services.IScreenWriterService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static cartelera.utils.Utils.invalidPosNumber;

@Slf4j
@AllArgsConstructor
@Service
public class ScreenWriterServiceImpl implements IScreenWriterService {

    private final RoomRepository screenwriteRepo;

    @Override
    public List<Room> findAll() {
        log.info("findAll");
        return screenwriteRepo.findAll();
    }

    @Override
    public Optional<Room> findById(Long id) {
        log.info("findById {}", id);
        if (invalidPosNumber(id)) return Optional.empty();
        return screenwriteRepo.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        log.info("existsById {}", id);
        if (invalidPosNumber(id)) return false;
        return screenwriteRepo.existsById(id);
    }

    @Override
    public Screenwriter save(Screenwriter screenwriter) {
        return null;
    }

    @Override
    public List<Screenwriter> findAllByCinemaId(Long id) {
        return null;
    }

    @Override
    public List<Screenwriter> findAllByScreenWriteId(Long id) {
        log.info("findAllByScreenWriteId {}", id);
        if (invalidPosNumber(id)) return new ArrayList<>();
        return null;
    }

    @Override
    public List<Screenwriter> findAllByFilmId(Long id) {
        log.info("findAllByFilmId {}", id);
        if (invalidPosNumber(id)) return new ArrayList<>();
        return null;
    }

    @Override
    public Room save(Room room) {
        return null;
    }


    @Override
    public void deleteById(Long id) {
        log.info("deleteById {}", id);
        if (invalidPosNumber(id) && !screenwriteRepo.existsById(id)) return;
        // desasociar room de cine
        Room room = findById(id).get();
        room.setCinema(null);
        room.setFilm(null);
        screenwriteRepo.deleteById(id);
    }

//    @Override
//    public void deleteAllById(List<Long> ids) {
//        log.info("deleteById {}", ids);
//        roomRepo.deleteAllById(ids);
//    }
//
//    @Override
//    public void saveAll(List<Room> rooms) {
//        log.info("saveAll {}", rooms);
//        roomRepo.saveAll(rooms);
//    }
}