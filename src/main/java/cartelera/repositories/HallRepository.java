package cartelera.repositories;

import cartelera.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class HallRepository implements JpaRepository<Room, Long> {

}
