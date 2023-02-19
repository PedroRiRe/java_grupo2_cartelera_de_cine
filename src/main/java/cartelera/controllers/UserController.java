package cartelera.controllers;

import cartelera.entities.User;
import cartelera.services.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Controller
public class UserController {

    private final IUserService userService;

    @GetMapping("/users")
    public String findAll(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "users-list";
    }

    @GetMapping("/user/{id}")
    public String findById(Model model, @PathVariable Long id) {
        Optional<User> user = userService.findById(id);
        if (user.isPresent()) model.addAttribute("user", user.get());
        else model.addAttribute("error", "Usuario no encontrado.");
        return "user-detail";
    }
}
