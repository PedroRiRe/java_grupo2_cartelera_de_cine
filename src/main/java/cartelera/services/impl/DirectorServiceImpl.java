package cartelera.services.impl;

import cartelera.entities.Director;
import cartelera.entities.Cinema;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static cartelera.utils.Utils.invalidPosNumber;

public class DirectorServiceImpl {

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
    public Set<String> citiesNames() {
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
