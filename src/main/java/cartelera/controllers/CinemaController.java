package cartelera.controllers;

import cartelera.entities.Cinema;
import cartelera.services.ICinemaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@AllArgsConstructor
@Controller
public class CinemaController {

    private final ICinemaService cinemaService;

    @GetMapping("cines")  // http://localhost:8080/cines
    public String findAll(Model model) {
        List<Cinema> cines = cinemaService.findAll();
        model.addAttribute("cines", cines);
        return "cine-list";
    }
}