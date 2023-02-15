package cartelera.services;


import cartelera.entities.Cinema;
import cartelera.exceptions.EntityDeleteException;
import cartelera.exceptions.EntitySavingException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ICinemaService {

    // CRUD

//    Cinema save(Cinema cinema) throws EntitySavingException;

    List<Cinema> findAll();

    Optional<Cinema> findById(Long id);

    List<Cinema> findAllByName(String name);
    List<Cinema> findAllByPhone(String phone);
    List<Cinema> findByNameAndPhone(String name, String phone);

    Cinema save(Cinema cinema);

    Optional<Cinema> findByName(String name);

    Optional<Cinema> findByPhone(String phone);

    Optional<Cinema> findByAddress();

    Cinema update(Cinema cine) throws EntitySavingException;

    void deleteById(Long id) throws EntityDeleteException;


    // LÓGICA DE NEGOCIO



}
