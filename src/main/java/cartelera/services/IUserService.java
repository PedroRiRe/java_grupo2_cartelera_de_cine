package cartelera.services;

import cartelera.entities.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    /**
     * Obtiene la lista completa de usuarios.
     * @return Lista de usuarios.
     */
    List<User> findAll();

    /**
     * Obtiene un usuario por su ID.
     * @param id Identificador.
     * @return Opcionalmente, el usuario solicitado.
     */
    Optional<User> findById(Long id);

    /**
     * Comprueba si existe un usuario por si ID.
     * @param id Identificador.
     * @return Verdadero si existe, falso en caso contrario.
     */
    boolean existsById(Long id);

    // boolean existsByUsername(String username);

    /**
     * Guarda un usuario.
     * @param user Usuario.
     * @return El usuario guardado.
     */
    User save(User user);

    /**
     * Birra una dirección por el ID.
     * @param id Identificador.
     */
    void deleteById(Long id);
}
