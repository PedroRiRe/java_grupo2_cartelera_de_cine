package cartelera.services.impl;

import cartelera.entities.Actor;
import cartelera.entities.Director;
import cartelera.entities.Cinema;
import cartelera.repositories.DirectorRepository;
import cartelera.services.IDirectorService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

import static cartelera.utils.Utils.invalidPosNumber;

@Slf4j
@AllArgsConstructor
@Service


public class DirectorServiceImpl implements IDirectorService {
    private final DirectorRepository directorRepo;

    public DirectorServiceImpl() {
        directorRepo = null;
    }


    @Override
    public List<Cinema> findAll() {
        return directorRepo.findAll();
    }

    @Override
    public Optional<Cinema> findById(Long id) {
        log.info("findById {}", id);
        if (invalidPosNumber(id)) return Optional.empty();
        return directorRepo.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        log.info("existsById {}", id);
        if (invalidPosNumber(id)) return false;
        return directorRepo.existsById(id);
    }

    @Override
    public boolean existsCity(String city) {
        return false;
    }

    @Override
    public Actor save(Actor actors) {
        return null;
    }

    @Override
    public Director save(Director directors) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
