package cartelera.services;

import cartelera.entities.Film;

import java.util.List;
import java.util.Optional;

public interface IFilmService {

    List<Film> findAll();

    Optional<Film> findById(Long id);

    boolean existsById(Long id);

    List<Film> findAllByRoomsCinemaAddressCityIgnoreCase(String city);

    Film save(Film film);

    void deleteById(Long id);
}
