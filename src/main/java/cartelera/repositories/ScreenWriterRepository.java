package cartelera.repositories;

import cartelera.entities.Address;
import cartelera.entities.Cinema;
import cartelera.entities.Director;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ScreenWriterRepository {
    Optional<Cinema> findByName(String name);

    List<Cinema> findAllByName(String name);

    List<Cinema> findAllByPhone(String phone);

    List<Cinema> findByNameAndPhone(String name, Address address);

    @Query("select c from Cinema c where c.address.id = ?1")
    Cinema findByAddress_Id(Long id);

    List<Cinema> findAllByAddressCity(String city);

    List<Director> findAll();

    boolean existsById(Long id);

    Optional<Cinema> findById(Long id);

    void save(DirectorRepository cinema);

    void deleteById(Long id);

    // Consulta Jakarta Persistence Query Language (JPQL) personalizada para recuperar entidades room asociadas
    // @Query("select cinema from Director director left join fetch cinema.rooms where cinema.id = :id")
    // Optional<Cinema> findByIdWithRooms(Long id);
}


