package cartelera.services.impl;

import cartelera.entities.Address;
import cartelera.repositories.AddressRepository;
import cartelera.services.IAddressService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@AllArgsConstructor
@Service
public class AddressServiceImpl implements IAddressService {

    private final AddressRepository addressRepo;

    @Override
    public List<Address> findAll() {
        log.info("findAll");
        return addressRepo.findAll();
    }

    @Override
    public Optional<Address> findById(Long id) {
        log.info("findById {}", id);
        if (id == null || id <= 0 ) return Optional.empty();
        return addressRepo.findById(id);
    }
}
