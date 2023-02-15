package cartelera.controllers;

import cartelera.entities.Cinema;
import cartelera.repositories.CinemaRepository;
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

    private final ICinemaService cineService;
    private final CinemaRepository cinemaRepository;

    @GetMapping("cines")  // http://localhost:8080/cines
    public String findAll(Model model) {
        List<Cinema> cines = cineService.findAll();
        model.addAttribute("cines", cines);
        return "cine-list";
    }

    @GetMapping("cines/{id}")
    public String findById(Model model, @PathVariable Long id) {
        Optional<Cinema> cineOpt = cineService.findById(id);
        if (cineOpt.isPresent())
            model.addAttribute("cine", cineOpt.get());
        else
            model.addAttribute("ERROR", "Cine no encontrado");
        return "cine-detail";
    }

    @GetMapping("cines/name/{name}")
    public String findAllByName(Model model, @PathVariable String name) {
        model.addAttribute("cines", cineService.findAllByName(name));
        return "cine-list";
    }

    @GetMapping("cines/phone/{phone}") // http://localhost:8080/cines/phone/456321
    public String findAllByPhone(Model model, @PathVariable String phone) {
        model.addAttribute("cines", cineService.findAllByPhone(phone));
        return "cine-list";
    }

    @GetMapping("cines/name/{name}/phone/{phone}")
    public String findByNameAndPhone(Model model,
                                     @PathVariable String name,
                                     @PathVariable String phone) {
        model.addAttribute("cines", cineService.findByNameAndPhone(name, phone));
        return "cine-list";
    }

    @GetMapping("cines/create")
    public String createForm(Model model) {
        model.addAttribute("cinema", new Cinema()); // objeto vacío para rellenar desde el formulario
        return "cine-form";
    }

    @PostMapping("cines")
    public String save(@ModelAttribute Cinema cinema) {
        cineService.save(cinema);
        return "redirect:/cines";
    }

}