package cartelera.controllers;
import cartelera.entities.Actor;
import cartelera.entities.Room;
import cartelera.services.IRoomService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

import static cartelera.utils.Utils.invalidPosNumber;

public class ActorController {

    private IRoomService addressRepository;
    private IRoomService actorService;

    /**
     * Lista todos los cines.
     * @param model Modelo.
     * @return Plantilla cinemas-list,
     */
    @GetMapping("/actor")
    public String findAll(Model model) {
        List<Room> actor = actorService.findAll();
        model.addAttribute("actor", actor);
        return "actor/actors-list";
    }

    /**
     * Muestra un cine específico.
     * @param model Modelo.
     * @param id Identificador.
     * @return Plantilla cinema-detail.
     */
    @GetMapping("actor/{id}")
    public String findById(Model model, @PathVariable Long id) {
        // Optional<Actor> cinemaOpt = actorService.findByIdWithRooms(id);
        if (!invalidPosNumber(id) && actorService.existsById(id)) {
            model.addAttribute("actor", actorService.findById(id).get());
            model.addAttribute("flim", actorService.findAllByCinemaId(id));
        } else model.addAttribute("error", "Actor no encontrado.");
        return "actor/actor-detail";
    }

    /**
     * Crea un nuevo cine.
     * @param model modelo.
     * @return Plantilla cinema-form.
     */
    @GetMapping("actors/create")
    public String createForm(Model model) {
        model.addAttribute("actor", new Actor());
        return "actor/actors-form";
    }

    /**
     * Edita un actor existente.
     * @param model Modelo.
     * @param id Identificador.
     * @return Plantilla cinema-form.
     */
    @GetMapping("actors/{id}/edit")
    public String editForm(Model model, @PathVariable Long id) {
        if (!invalidPosNumber(id) && actorService.existsById(id))
            model.addAttribute("actor", actorService.findById(id).get());
        else model.addAttribute("error", "Actor no encontrado.");
        return "actor/actor-form";
    }

    /**
     * Guarda el cine obtenido desde el formulario.
     *
     * @param actor           Cine.
     * @param actorRepository
     * @return Plantilla cinemas.
     */
    @PostMapping("actors")
    public String saveForm(@ModelAttribute Actor actor, IRoomService actorRepository) {
        actorRepository.save(actor.getAddress());
        actorService.save(actor.getAddress());
        actorService.save(actor.getAddress());
        return "redirect:/actors";
    }

    /**
     * Borra un cine por su ID.
     * @param id Identificador.
     * @return Plantilla cinemas.
     */
    @GetMapping("actors/{id}/delete")
    public String deleteById(@PathVariable Long id) {
        if (!invalidPosNumber(id) && actorService.existsById(id)) actorService.deleteById(id);
        return "redirect:/actor";
    }

}
