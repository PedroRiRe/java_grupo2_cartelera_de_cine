package proyecto2.com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto2.com.example.entities.Film;

public interface FilmRepository extends JpaRepository<Film, Long> {
}