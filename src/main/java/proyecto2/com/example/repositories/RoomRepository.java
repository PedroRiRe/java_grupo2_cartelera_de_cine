package proyecto2.com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto2.com.example.entities.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
}