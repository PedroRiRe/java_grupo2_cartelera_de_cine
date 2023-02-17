package cartelera.controllers;

import cartelera.entities.Address;
import cartelera.entities.Cinema;
import cartelera.services.ICinemaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Controller
public class CinemaController {

    private final ICinemaService cinemaService;

    @GetMapping("/cinemas")
    public String findAll(Model model) {
        List<Cinema> cinemas = cinemaService.findAll();
        if (cinemas != null) model.addAttribute("cinemas", cinemas);
        else model.addAttribute("warning", "Empty list.");
        return "cinemas-list";
    }

    @GetMapping("/cinema/{id}")
    public String findById(Model model, @PathVariable Long id) {
        Optional<Cinema> cinema = cinemaService.findById(id);
        if (cinema.isPresent()) model.addAttribute("cinema", cinema.get());
        else model.addAttribute("error", "404 Cinema Not Found");
        return "cinema-detail";
    }
}