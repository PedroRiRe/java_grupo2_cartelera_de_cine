package cartelera.controllers;

import cartelera.entities.Room;
import cartelera.services.ICinemaService;
import cartelera.services.IFilmService;
import cartelera.services.IRoomService;
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
public class RoomController {

    private final IRoomService roomService;
    private final ICinemaService cinemaService;
    private final IFilmService filmService;

    @GetMapping("/rooms")
    public String findAll(Model model) {
        List<Room> rooms = roomService.findAll();
        model.addAttribute("rooms", rooms);
        return "room/rooms-list";
    }

    @GetMapping("/room/{id}")
    public String findById(Model model, @PathVariable Long id) {
        Optional<Room> room = roomService.findById(id);
        if (room.isPresent()) model.addAttribute("room", room.get());
        else model.addAttribute("error", "Sala no encontrada.");
        return "room/room-detail";
    }

    @GetMapping("rooms/film/{id}")
    public String findByFilmId(Model model, @PathVariable Long id) {
        model.addAttribute("rooms", roomService.findAllByFilmId(id));
        return "room/rooms-list";
    }

    @GetMapping("rooms/cinema/{id}")
    public String findByCinemaId(Model model, @PathVariable Long id) {
        model.addAttribute("rooms", roomService.findAllByCinemaId(id));
        return "room/rooms-list";
    }

    @GetMapping("rooms/create")
    public String createForm(Model model) {
        model.addAttribute("room", new Room());
        model.addAttribute("cinemas", cinemaService.findAll());
        model.addAttribute("films", filmService.findAll());
        return "room/rooms-list";
    }

    @GetMapping("rooms/{id}/edit")
    public String editForm(Model model, @PathVariable Long id) {
        Optional<Room> roomOpt = roomService.findById(id);
        if (roomOpt.isPresent()) {
            model.addAttribute("room", roomOpt.get());
            model.addAttribute("cinemas", cinemaService.findAll());
            model.addAttribute("films", filmService.findAll());
        } else {
            model.addAttribute("error", "404 La sala desapareció");
        }

        return "room/room-form";
    }


    @PostMapping("/rooms")
    public String saveForm(@ModelAttribute Room room) {
        roomService.save(room);
        return "redirect:/rooms";
    }

    @GetMapping("rooms/{id}/delete")
    public String deleteById(@PathVariable Long id) {
        roomService.deleteById(id);
        return "redirect/rooms";
    }

}
