package proyecto2.com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto2.com.example.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}