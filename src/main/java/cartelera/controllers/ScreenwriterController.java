package cartelera.controllers;
import cartelera.services.IScreenWriterService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import static cartelera.utils.Utils.invalidPosNumber;

public class ScreenwriterController {


    private IScreenWriterService screenwriterService;


    /**
     * Lista todos los guionistas
     * @param model Modelo.
     * @return Plantilla screen-list,
     */
   /* @GetMapping("/screenwriter")
    public String findAll(Model model) {
        model.addAttribute("screenwriter", screenwriter);
        return "screenwriter/screenwriter-list";
    } */

    /**
     * Muestra un cine específico.
     * @param model Modelo.
     * @param id Identificador.
     * @return Plantilla cinema-detail.
     */
    @GetMapping("cinema/{id}")
    public String findById(Model model, @PathVariable Long id) {
        // Optional<Screen> screenOpt = screenService.findByIdWithRooms(id);
        if (!invalidPosNumber(id) && screenwriterService.existsById(id)) {
            model.addAttribute("screen", screenwriterService.findById(id).get());
        } else model.addAttribute("error", "Guionista no encontrado.");
        return "screenwriter/screenwriter-detail";
    }

    /**
     * Crea un nuevo cine.
     * @param model modelo.
     * @return Plantilla screenwriter-form.
     */
    @GetMapping("screenwriters/create")
    public String createForm(Model model) {
        //model.addAttribute("screenwriter", new Screenwriter());//
        return "screenwriter/screenwriter-form";
    }

    /**
     * Edita un cine existente.
     * @param model Modelo.
     * @param id Identificador.
     * @return Plantilla screenwriter-form.
     */
    @GetMapping("screenwriters/{id}/edit")
    public String editForm(Model model, @PathVariable Long id) {
        if (!invalidPosNumber(id) && screenwriterService.existsById(id))
            model.addAttribute("cinema", screenwriterService.findById(id).get());
        else model.addAttribute("error", "Guionista no encontrada.");
        return "screenwriter/screenwriter-form";
    }

    /**
     * Guarda el cine obtenido desde el formulario.
     * @return Plantilla screenwriter.
     */
    //@PostMapping("screenwriter")
    //public String saveForm(@ModelAttribute Screenwriter screenwriter) {
        //screenwriterService.save((DirectorRepository) screenwriter);
        //return "redirect:/screenwrite";//
    //


    /**
     * Borra un cine por su ID.
     * @param id Identificador.
     * @return Plantilla cinemas.
     */
    @GetMapping("screenwriter/{id}/delete")
    public String deleteById(@PathVariable Long id) {
        if (!invalidPosNumber(id) && screenwriterService.existsById(id)) screenwriterService.deleteById(id);
        return "redirect:/screenwriter";
    }
}

