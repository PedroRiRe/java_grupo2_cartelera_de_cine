package cartelera.controllers;

import cartelera.entities.Film;
import cartelera.services.IFilmService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Controller
public class FilmController {

    private final IFilmService filmService;

    @GetMapping("/films")
    public String findAll(Model model) {
        List<Film> films = filmService.findAll();
        model.addAttribute("films", films);
        return "films-list";
    }

    @GetMapping("/film/{id}")
    public String findById(Model model, @PathVariable Long id) {
        Optional<Film> film = filmService.findById(id);
        if (film.isPresent()) model.addAttribute("film", film.get());
        else model.addAttribute("error", "404 Película no encontrada");
        return "film-detail";
    }

    @GetMapping("/city/{city}")
    public String findByRooms_Cinema_Address_CityIgnoreCase(Model model, @PathVariable String city) {
        if (city != null && !city.trim().isEmpty()) {
            city = city.trim();
            // TODO método para poner en mayúsculas la primera letra de cada palabra (ciudades con nombres compuestos)
            city = city.substring(0, 1).toUpperCase() + city.substring(1).toLowerCase();
            List<Film> films = filmService.findByRooms_Cinema_Address_CityIgnoreCase(city);
            model.addAttribute("films", films);
            model.addAttribute("city", city);
        } else model.addAttribute("error", "404 Ciudad no encontrada");
        return "films-city";
    }
}
