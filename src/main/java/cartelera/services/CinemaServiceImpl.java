package cartelera.services;

import cartelera.entities.Cinema;
import cartelera.exceptions.EntityDeleteException;
import cartelera.exceptions.EntitySavingException;
import cartelera.repositories.CinemaRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Slf4j
@AllArgsConstructor
@Service

public class CinemaServiceImpl implements ICinemaService {
    private final CinemaRepository cinemaRepo;

    @Override
    public Cinema save(Cinema cinema) throws EntitySavingException {
        if(cinema == null)
            throw new IllegalArgumentException("Cine no puede ser null");

        if(cinema.getId() != null)
            update(cinema);

        try {
            return cinemaRepo.save(cinema);
        } catch (Exception e) {
            log.error("Error guardando cine", e);
        }

        throw new EntitySavingException("Error guardando usuario");
    }

    @Override
    public Cinema update(Cinema cine) throws EntitySavingException {
        if(cine == null)
            throw new IllegalArgumentException("Cine no puede ser null");

        if(cine.getId() == null)
            throw new IllegalArgumentException("Cine ID no puede ser null");

        if(!cinemaRepo.existsById(cine.getId()))
            throw new EntityNotFoundException("Cine no existe");

        Cinema cineFromDB = cinemaRepo.findById(cine.getId()).get();
        // solo cambiamos los atributos deseados
        cineFromDB.setPhone(cine.getPhone());
        cineFromDB.setUrl(cine.getUrl());
        cineFromDB.setEmail(cine.getEmail());
        cineFromDB.setLinkedIn(cine.getLinkedIn());
        cineFromDB.setTwitter(cine.getTwitter());

        try {
            return cinemaRepo.save(cineFromDB);
        } catch (Exception e) {
            log.error("Error guardando usuario", e);
        }

        throw new EntitySavingException("Error guardando usuario");

    }

    @Override
    public List<Cinema> findAll() {
        log.info("findAll");
        return cinemaRepo.findAll();
    }

    @Override
    public Optional<Cinema> findById(Long id) {
        log.info("findById {}", id);
        if (id == null || id <= 0)
            return Optional.empty();
        return Optional.empty();
    }

    @Override
    public Optional<Cinema> findByName(String name) {
        log.info("findByName {}", name);
        return cinemaRepo.findByName(name);
    }

    @Override
    public Optional<Cinema> findByPhone(String phone) {
        log.info("findByPhone {}", phone);
        return cinemaRepo.findByName(phone);
    }

    @Override
    public Optional<Cinema> findByAddress() {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) throws EntityDeleteException {
        log.info("deleteById {}", id);

        try {
            cinemaRepo.deleteById(id);
        } catch (Exception e) {
            log.error("Error al intentar borrar el cine", e);
        }
        throw new EntityDeleteException("Error borrando usuario");
    }
}
