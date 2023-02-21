package cartelera.controllers;

import cartelera.entities.Address;
import cartelera.services.IAddressService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Controller
public class AddressController {

    private final IAddressService addressService;

    @GetMapping("/addresses")
    public String findAll(Model model) {
        List<Address> addresses = addressService.findAll();
        model.addAttribute("addresses", addresses);
        return "addresses-list";
    }

    @GetMapping("/address/{id}")
    public String findById(Model model, @PathVariable Long id) {
        Optional<Address> address = addressService.findById(id);
        if (address.isPresent()) model.addAttribute("address", address.get());
        else model.addAttribute("error", "Dirección no encontrada.");
        return "address-detail";
    }

    @GetMapping("addresses/create")
    public String createForm(Model model) {
        model.addAttribute("address", new Address());
        return "address-form";
    }
}