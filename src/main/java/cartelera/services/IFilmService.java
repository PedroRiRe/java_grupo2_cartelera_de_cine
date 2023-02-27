package cartelera.services;

import cartelera.entities.Film;

import java.util.List;
import java.util.Optional;

public interface IFilmService {

    List<Film> findAll();

    Optional<Film> findById(Long id);

    List<Film> findByRooms_Cinema_Address_CityIgnoreCase(String city);
    Film save(Film film);
    void deleteById(Long id);
    void deleteAllById(List<Long> ids);
    void saveAll(List<Film> films);
}
