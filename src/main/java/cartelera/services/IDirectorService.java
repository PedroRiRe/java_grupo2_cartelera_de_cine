package cartelera.services;

import cartelera.entities.Actor;
import cartelera.entities.Cinema;
import cartelera.entities.Director;

import java.util.List;
import java.util.Optional;


public interface IDirectorService {

    List<Cinema> findAll();

    Optional<? extends Object> findById(Long id);

    /**
     * Comprueba si existe una dirección por su ID.
     * @param id Identificador.
     * @return Verdadero si existe, falso en caso contrario.
     */
    boolean existsById(Long id);

    /**
     * Comprueba si existe el nombre de una ciudad en alguna dirección.
     * @param city Ciudad.
     * @return Verdadero si existe, falso en caso contrario.
     */
    boolean existsCity(String city);

    /**
     * Obtiene una lista de nombres de ciudades disponibles.
     * @return Lista de nombres de ciudades.
     */
    /**
     * Guarda una dirección.
     * @param actors Dirección.
     * @return La dirección guardada.
     */
    Actor save(Actor actors);

    Director save(Director directors);

    /**
     * Borra una dirección por el ID.
     * @param id Identificador.
     */
    void deleteById(Long id);

    // void deleteAllById(List<Long> ids);

    // void saveAll(List<Address> addresses);
}


