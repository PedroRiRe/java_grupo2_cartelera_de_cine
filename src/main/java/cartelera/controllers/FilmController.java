package cartelera.controllers;

import cartelera.entities.Film;
import cartelera.services.IAddressService;
import cartelera.services.IFilmService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import static cartelera.utils.Utils.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Controller
public class FilmController {

    private final IFilmService filmService;
    private final IAddressService addressService;

    @GetMapping("/")
    public String index() {
        return "redirect:/films";
    }

    @GetMapping("/films")
    public String findAll(Model model) {
        List<Film> films = filmService.findAll();
        model.addAttribute("films", films);
        //model.addAttribute("cities", addressService.citiesNames());
        return "film-list";
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

    @GetMapping("films/create")
    public String createForm(Model model) {
        model.addAttribute("film",new Film());
        return "film-form";
    }

    @GetMapping("films/{id}/edit")
    public String editForm(Model model, @PathVariable Long id) {
        Optional<Film> filmOptional = filmService.findById(id);
        if (filmOptional.isPresent())
            model.addAttribute("film", filmOptional.get());
        else
            model.addAttribute("error", "Film not found");

        return "film-form";
    }

    @PostMapping("films")
    public String save(@ModelAttribute Film film) {
        filmService.save(film);
        return "redirect:/films";
    }

    @GetMapping("films/{id}/delete")
    public String deleteById(@PathVariable Long id) {
        filmService.deleteById(id);
        return "redirect:/films";
    }
}
