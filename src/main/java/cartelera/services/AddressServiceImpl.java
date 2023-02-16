package cartelera.services;

import cartelera.entities.Address;
import cartelera.repositories.AddressRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@AllArgsConstructor
@Service
public class AddressServiceImpl implements IAddressService {

    private final AddressRepository addressRepository;

    @Override
    public List<Address> findAll() {
        log.info("findAll");
        return addressRepository.findAll();
    }

    @Override
    public Optional<Address> findById(Long id) {
        log.info("findById {}", id);
        return addressRepository.findById(id);
    }
}
