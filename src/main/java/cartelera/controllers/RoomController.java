package cartelera.controllers;

import cartelera.entities.Room;
import cartelera.services.IRoomService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Controller
public class RoomController {

    private final IRoomService roomService;

        @GetMapping("/rooms")
            public String findAll(Model model) {
                List<Room> rooms = roomService.findAll();
                model.addAttribute("rooms", rooms);
                return "rooms-list";
            }

        @GetMapping("/room/{id}")
        public String findById(Model model, @PathVariable Long id) {
            Optional<Room> room = roomService.findById(id);
            if (room.isPresent()) model.addAttribute("room", room.get());
            else model.addAttribute("error", "Sala no encontrada.");
            return "room-detail";
        }

    @GetMapping("room/create")
    public String createForm(Model model) {
        model.addAttribute("room", new Room()); // objeto vacío para rellenar desde el formulario
        return "rooms-form";
    }
    }
