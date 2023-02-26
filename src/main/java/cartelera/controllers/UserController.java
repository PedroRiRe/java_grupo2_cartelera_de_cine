package cartelera.controllers;

import cartelera.entities.User;
import cartelera.services.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
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
public class UserController {

    private final IUserService userService;
    private final PasswordEncoder passwordEncoder;

    @GetMapping("/users")
    public String findAll(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "user/users-list";
    }

    @GetMapping("/user/{id}")
    public String findById(Model model, @PathVariable Long id) {
        Optional<User> user = userService.findById(id);
        if (user.isPresent()) model.addAttribute("user", user.get());
        else model.addAttribute("error", "Usuario no encontrado.");
        return "user/user-detail";
    }

    @GetMapping("users/create")
    public String createForm(Model model) {
        model.addAttribute("user", new User());
        return "user/user-form";
    }

    @GetMapping("users/{id}/edit")
    public String editForm(Model model, @PathVariable Long id) {
        Optional<User> user = userService.findById(id);
        if (user.isPresent()) model.addAttribute("user", user.get());
        else model.addAttribute("error", "Usuario no encontrado.");
        return "user/user-form";
    }

    @PostMapping("users")
    public String save(@ModelAttribute User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.save(user);
        return "redirect:/users";
    }

    @GetMapping("users/{id}/delete")
    public String deleteById(@PathVariable Long id) {
        userService.deleteById(id);
        return "redirect:/users";
    }
}
