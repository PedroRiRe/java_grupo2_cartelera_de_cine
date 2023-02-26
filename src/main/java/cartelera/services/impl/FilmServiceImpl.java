package cartelera.services.impl;

import cartelera.entities.Film;
import cartelera.entities.Room;
import cartelera.repositories.FilmRepository;
import cartelera.services.IFilmService;
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
public class FilmServiceImpl implements IFilmService {

    private final FilmRepository filmRepo;
    private final IRoomService roomService;

    @Override
    public List<Film> findAll() {
        log.info("findAll");
        return filmRepo.findAll();
    }

    @Override
    public Optional<Film> findById(Long id) {
        log.info("findById {}", id);
        if (id == null || id <= 0 ) return Optional.empty();
        return filmRepo.findById(id);
    }

    @Override
    public List<Film> findByRooms_Cinema_Address_CityIgnoreCase(String city) {
        log.info("findByRooms_Cinema_Address_CityIgnoreCase {}", city);
        if (city == null || city.trim().isEmpty()) return new ArrayList<>();
        return filmRepo.findByRooms_Cinema_Address_CityIgnoreCase(city);
    }

    @Override
    public Film save(Film film) {
        return filmRepo.save(film);
    }
    @Override
    public void deleteById(Long id) {
        // desasociar film de rooms
        List<Room> rooms = roomService.findAllByFilmId(id);
        for (Room room : rooms) {
            room.setFilm(null);
        }
        roomService.saveAll(rooms);

        filmRepo.deleteById(id);
    }


}
