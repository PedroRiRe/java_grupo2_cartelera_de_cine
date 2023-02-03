package proyecto2.com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto2.com.example.entities.Director;

public interface DirectorRepository extends JpaRepository<Director, Long> {
}