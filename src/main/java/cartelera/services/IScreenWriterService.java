package cartelera.services;
import cartelera.entities.Room;
import cartelera.entities.Screenwriter;

import java.util.List;
import java.util.Optional;

public interface IScreenWriterService {
    List<Room> findAll();

    Optional<? extends Object> findById(Long id);

    /**
     * Comprueba si existe una dirección por su ID.
     * @param id Identificador.
     * @return Verdadero si existe, falso en caso contrario.
     */
    boolean existsById(Long id);

    Screenwriter save(Screenwriter screenwriter);


    List<Screenwriter> findAllByCinemaId(Long id);

    List<Screenwriter> findAllByScreenWriteId(Long id);

    List<Screenwriter> findAllByFilmId(Long id);

    Room save(Room room);

    /**
     * Borra una dirección por el ID.
     * @param id Identificador.
     */
    void deleteById(Long id);

    // void deleteAllById(List<Long> ids);

    // void saveAll(List<Address> addresses);
}

