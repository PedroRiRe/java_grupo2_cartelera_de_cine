package cartelera.services;

import cartelera.entities.Address;
import cartelera.entities.Film;

import java.util.List;
import java.util.Optional;

public interface IFilmService {

    List<Film> findAll();
    Optional<Film> findById(Long id);

}
