package cartelera.services;

import cartelera.entities.Address;
import java.util.List;
import java.util.Optional;

public interface IAddressService {

    List<Address> findAll();

    Optional<Address> findById(Long id);
}
