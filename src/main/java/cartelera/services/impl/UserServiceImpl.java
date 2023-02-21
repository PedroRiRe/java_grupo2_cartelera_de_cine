package cartelera.services.impl;

import cartelera.entities.Address;
import cartelera.entities.User;
import cartelera.repositories.AddressRepository;
import cartelera.repositories.UserRepository;
import cartelera.services.IAddressService;
import cartelera.services.IUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@AllArgsConstructor
@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepo;

    @Override
    public List<User> findAll() {
        log.info("findAll");
        return userRepo.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        log.info("findById {}", id);
        if (id == null || id <= 0 ) return Optional.empty();
        return userRepo.findById(id);
    }
}
