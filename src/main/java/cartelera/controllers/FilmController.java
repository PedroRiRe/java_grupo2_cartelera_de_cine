package cartelera.controllers;

import cartelera.entities.Film;
import cartelera.services.IAddressService;
import cartelera.services.IFilmService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import static cartelera.utils.Utils.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Controller
public class FilmController {

    private final IFilmService filmService;
    private final IAddressService addressService;

    @GetMapping("/films")
    public String findAll(Model model) {
        List<Film> films = filmService.findAll();
        model.addAttribute("films", films);
        model.addAttribute("cities", addressService.citiesNames());
        return "films-list";
    }

    @GetMapping("/film/{id}")
    public String findById(Model model, @PathVariable Long id) {
        Optional<Film> film = filmService.findById(id);
        if (film.isPresent()) model.addAttribute("film", film.get());
        else model.addAttribute("error", "Película no encontrada.");
        return "film-detail";
    }

    @GetMapping("/films/{city}")
    public String findByRooms_Cinema_Address_CityIgnoreCase(Model model, @PathVariable String city) {
        if (!stringIsEmpty(city) && addressService.existsCity(city.trim())) {
            city = firstCharUpercase(city.trim());
            List<Film> films = filmService.findByRooms_Cinema_Address_CityIgnoreCase(city);
            model.addAttribute("city", city);
            if (!films.isEmpty()) model.addAttribute("films", films);
            else model.addAttribute("warning", "No hay películas en «" + city + "».");
        } else model.addAttribute("error", "Ciudad «" + city + "» no encontrada.");
        return "films-city";
    }

    @GetMapping("/films/create")
    public String createFilm(Model model) {
        model.addAttribute("film",new Film());
        return "film-form";
    }
}
