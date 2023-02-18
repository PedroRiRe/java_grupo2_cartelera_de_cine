package cartelera.controllers;

import cartelera.entities.Address;
import cartelera.entities.Film;
import cartelera.services.IAddressService;
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
        if (films != null) model.addAttribute("films", films);
        else model.addAttribute("warning", "Empty list.");
        return "films-list";
    }

    @GetMapping("/film/{id}")
    public String findById(Model model, @PathVariable Long id) {
        Optional<Film> film = filmService.findById(id);
        if (film.isPresent()) model.addAttribute("film", film.get());
        else model.addAttribute("error", "404 Address Not Found");
        return "film-detail";
    }
}
