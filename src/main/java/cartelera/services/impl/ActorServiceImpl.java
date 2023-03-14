package cartelera.services.impl;

import cartelera.entities.Actor;
import cartelera.entities.Cinema;
import cartelera.repositories.ActorRepository;
import cartelera.services.IActorService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static cartelera.utils.Utils.invalidPosNumber;

@Slf4j
@AllArgsConstructor
@Service


public class ActorServiceImpl implements IActorService {

    private final ActorRepository actorRepo;

    public ActorServiceImpl() {
        actorRepo = null;
    }


    @Override
    public List<Cinema> findAll() {
        return actorRepo.findAll();
    }

    @Override
        public Optional<Cinema> findById(Long id) {
        log.info("findById {}", id);
        if (invalidPosNumber(id)) return Optional.empty();
        return actorRepo.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        log.info("existsById {}", id);
        if (invalidPosNumber(id)) return false;
        return actorRepo.existsById(id);
    }

    @Override
    public boolean existsCity(String city) {
        return false;
    }

    @Override
    public Set<String> citiesNames() {
        return null;
    }

    @Override
    public Actor save(Actor actors) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }


}
