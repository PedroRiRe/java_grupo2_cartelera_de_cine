package proyecto2.com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto2.com.example.entities.Pelicula;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
}