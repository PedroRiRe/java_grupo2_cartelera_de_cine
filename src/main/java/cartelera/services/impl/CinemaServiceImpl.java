package cartelera.services.impl;

import cartelera.entities.Cinema;
import cartelera.repositories.CinemaRepository;
import cartelera.services.ICinemaService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Slf4j
@AllArgsConstructor
@Service

public class CinemaServiceImpl implements ICinemaService {

    private final CinemaRepository cinemaRepo;

    @Override
    public List<Cinema> findAll() {
        return cinemaRepo.findAll();
    }

    @Override
    public Optional<Cinema> findById(Long id) {
        return cinemaRepo.findById(id);
    }

    @Override
    public Cinema save(Cinema cinema) {
        return cinemaRepo.save(cinema);
    }

    @Override
    public void deleteById(Long id) {
        cinemaRepo.deleteById(id);
    }
}
