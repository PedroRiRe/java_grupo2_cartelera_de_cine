package cartelera.services;

import cartelera.entities.Cinema;
import cartelera.entities.Room;

import java.util.List;
import java.util.Optional;

public interface ICinemaService {

    // CRUD
    List<Cinema> findAll();

    Optional<Cinema> findById(Long id);

    Cinema save(Cinema cinema);

    Cinema save(Room Room);

    void deleteById(Long id);


    // LÓGICA DE NEGOCIO

}
