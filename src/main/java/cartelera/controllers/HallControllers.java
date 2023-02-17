package cartelera.controllers;
import com.example.entities.Hall;
import com.example.services.ControllerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Controller

public class HallControllers {

        private final HallService hallService;



        @GetMapping("/hall") // http://localhost:8080/beers
        public String findAll(Model model) {
            List<Hall> halls = HallService.findAll();
            model.addAttribute("halls", halls);
            model.addAttribute("message", "Hola mundo");
            return "hall-list";
        }

        @GetMapping("/halls/{id}") // http://localhost:8080/halls/1
        public String findById(Model model, @PathVariable Long id) {
            Optional<Hall> beerOpt = hallsService.findById(id);

            if(hallOpt.isPresent()) {
                model.addAttribute("hall", hallOpt.get());
            } else {
                model.addAttribute("error", "404 Hall Not Found");
            }

            return "hall-detail";
        }

    }
