package cartelera.services;

import cartelera.entities.Address;
import cartelera.entities.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    List<User> findAll();

    Optional<User> findById(Long id);

}
