package cartelera.services;

import cartelera.entities.Address;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface IAddressService {

    List<Address> findAll();

    Optional<Address> findById(Long id);

    boolean existsCity(String city);

    Set<String> citiesNames();
}
