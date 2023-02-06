package proyecto2.com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto2.com.example.entities.Gender;

public interface GenderRepository extends JpaRepository<Gender, Long> {
}