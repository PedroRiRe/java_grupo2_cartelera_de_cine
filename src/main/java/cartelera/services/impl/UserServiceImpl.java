package cartelera.services.impl;

import cartelera.entities.User;
import cartelera.repositories.AddressRepository;
import cartelera.repositories.UserRepository;
import cartelera.services.IUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static cartelera.utils.Utils.invalidPosNumber;

import java.util.List;
import java.util.Optional;

@Slf4j
@AllArgsConstructor
@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepo;
    private final AddressRepository addressRepo;

    @Override
    public List<User> findAll() {
        log.info("findAll");
        return userRepo.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        log.info("findById {}", id);
        if (invalidPosNumber(id)) return Optional.empty();
        return userRepo.findById(id);
    }

    public User save(User user) {
        return userRepo.save(user);
    }

    public void deleteById(Long id) {
        if (!invalidPosNumber(id) && userRepo.existsById(id)) userRepo.deleteById(id);
    }
}
