package cartelera.controllers;

import cartelera.entities.Cinema;
import cartelera.services.ICinemaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Controller
public class CinemaController {

    private final ICinemaService cinemaService;

    @GetMapping("/cinemas")
    public String findAll(Model model) {
        List<Cinema> cinemas = cinemaService.findAll();
        model.addAttribute("cinemas", cinemas);
        return "cinema/cinemas-list";
    }

    @GetMapping("/cinema/{id}")
    public String findById(Model model, @PathVariable Long id) {
        Optional<Cinema> cinema = cinemaService.findById(id);
        if (cinema.isPresent()) model.addAttribute("cinema", cinema.get());
        else model.addAttribute("error", "Cine no encontrado.");
        return "cinema/cinema-detail";
    }

    @GetMapping("cinemas/create")
    public String createForm(Model model) {
        model.addAttribute("cinema", new Cinema());
        return "cinema/cinema-form";
    }

    @GetMapping("cinemas/{id}/edit")
    public String editForm(Model model, @PathVariable Long id) {
        Optional<Cinema> cinemaOpt = cinemaService.findById(id);
        if(cinemaOpt.isPresent())
            model.addAttribute("cinema", cinemaOpt.get());
        else
            model.addAttribute("error", "No encontramos este cine");
        return "cinema/cinema-form";
    }

    @PostMapping("cinemas")
    public String saveForm(@ModelAttribute Cinema cinema) {
        cinemaService.save(cinema);
        return "redirect:/cinemas";
    }

    @GetMapping("cinemas/{id}/delete")
    public String deleteById(@PathVariable Long id) {
        cinemaService.deleteById(id);
        return "redirect:/cinemas";
    }
}