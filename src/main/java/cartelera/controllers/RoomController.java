package cartelera.controllers;

import cartelera.entities.Room;
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
    @GetMapping("room/create")
    public String createForm(Model model) {
        model.addAttribute("room", new Room());
        return "room/hall-form";
    }

    @GetMapping("room/{id}/edit")
    public String editForm(Model model, @PathVariable Long id) {
        Optional<Room> roomOpt = roomService.findById(id);
        if(roomOpt.isPresent())
            model.addAttribute("room", roomOpt.get());
        else
            model.addAttribute("error", "No encontramos esta sala");
        return "room/room-form";
    }

    @PostMapping("rooms")
    public String saveForm(@ModelAttribute Room room) {
        roomService.save(room);
        return "redirect:/rooms";
    }

    @GetMapping("rooms/{id}/delete")
    public String deleteById(@PathVariable Long id) {
        roomService.deleteById(id);
        return "redirect:/rooms";
    }
}

