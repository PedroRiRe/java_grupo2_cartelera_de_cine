package cartelera.services.impl;

import cartelera.entities.Address;
import cartelera.repositories.AddressRepository;
import cartelera.services.IAddressService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static cartelera.utils.Utils.stringIsEmpty;

import java.util.*;

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

    @Override
    public boolean existsCity(String city) {
        return !stringIsEmpty(city) && !addressRepo.findByCityIgnoreCase(city).isEmpty();
    }

    @Override
    public Set<String> citiesNames() {
        Set<String> citiesNames = new HashSet<>();
        for (Address city : addressRepo.findAll()) citiesNames.add(city.getCity());
        return citiesNames;
    }
}
