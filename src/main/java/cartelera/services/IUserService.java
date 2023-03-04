package cartelera.services;

import cartelera.entities.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    List<User> findAll();

    Optional<User> findById(Long id);

    boolean existsById(Long id);

    boolean existsByUsername(String username);

    User save(User user);

    void deleteById(Long id);
}
