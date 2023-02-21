package cartelera.services;

import cartelera.entities.Cinema;

import java.util.List;
import java.util.Optional;

public interface ICinemaService {

    // CRUD

//    Cinema save(Cinema cinema) throws EntitySavingException;

    List<Cinema> findAll();

    Optional<Cinema> findById(Long id);

    Optional<Cinema> findByName(String name);

    Optional<Cinema> findByPhone(String phone);

    List<Cinema> findAllByAddressCity(String city);

//    Optional<Cinema> findByAddress();
//
//    Cinema update(Cinema cine) throws EntitySavingException;
//
//    void deleteById(Long id) throws EntityDeleteException;


    // LÓGICA DE NEGOCIO

}
