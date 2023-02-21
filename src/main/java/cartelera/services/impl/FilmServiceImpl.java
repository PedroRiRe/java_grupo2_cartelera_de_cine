package cartelera.services.impl;

import cartelera.entities.Address;
import cartelera.entities.Film;
import cartelera.repositories.AddressRepository;
import cartelera.repositories.FilmRepository;
import cartelera.services.IAddressService;
import cartelera.services.IFilmService;
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
}
