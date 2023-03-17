package cartelera.services;

import cartelera.entities.Actor;
import cartelera.entities.Director;

import java.util.List;
import java.util.Optional;


public interface IDirectorService {

    List<Director> findAll();

    Optional<? extends Object> findById(Long id);

    /**
     * Comprueba si existe una dirección por su ID.
     *
     * @param id Identificador.
     * @return Verdadero si existe, falso en caso contrario.
     */
    boolean existsById(Long id);

    boolean existsCity(String city);

    Actor save(Actor actors);

    Director save(Director directors);

    /**
     * Borra una dirección por el ID.
     *
     * @param id Identificador.
     */
    void deleteById(Long id);

}


