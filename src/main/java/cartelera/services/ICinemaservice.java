package cartelera.services;

import cartelera.entities.Cinema;
import cartelera.exceptions.EntityDeleteException;
import cartelera.exceptions.EntitySavingException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ICinemaservice {

    // CRUD

    Cinema save(Cinema cinema) throws EntitySavingException;

    List<Cinema> findAll();

    Optional<Cinema> findById(Long id);

    Optional<Cinema> findByName(String name);

    Optional<Cinema> findByPhone(String phone);

    Optional<Cinema> findByAddress();

    Cinema update(Cinema cine) throws EntitySavingException;

    void deleteById(Long id) throws EntityDeleteException;


    // LÓGICA DE NEGOCIO



}
