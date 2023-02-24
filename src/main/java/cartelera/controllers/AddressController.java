package cartelera.controllers;

import cartelera.entities.Address;
import cartelera.entities.Film;
import cartelera.services.IAddressService;
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
public class AddressController {

    private final IAddressService addressService;

    @GetMapping("/addresses")
    public String findAll(Model model) {
        List<Address> addresses = addressService.findAll();
        model.addAttribute("addresses", addresses);
        return "address/addresses-list";
    }

    @GetMapping("/address/{id}")
    public String findById(Model model, @PathVariable Long id) {
        Optional<Address> address = addressService.findById(id);
        if (address.isPresent()) model.addAttribute("address", address.get());
        else model.addAttribute("error", "Dirección no encontrada.");
        return "address/address-detail";
    }

    @GetMapping("addresses/create")
    public String createForm(Model model) {
        model.addAttribute("address", new Address());
        return "address/address-form";
    }

    @GetMapping("addresses/{id}/edit")
    public String editForm(Model model, @PathVariable Long id) {
        Optional<Address> addressOptional = addressService.findById(id);
        if (addressOptional.isPresent())
            model.addAttribute("address", addressOptional.get());
        else
            model.addAttribute("error", "Address not found");

        return "address/address-form";
    }

    @PostMapping("addresses")
    public String save(@ModelAttribute Address address) {
        addressService.save(address);
        return "redirect:/addresses";
    }

    @GetMapping("addresses/{id}/delete")
    public String deleteById(@PathVariable Long id) {
        addressService.deleteById(id);
        return "redirect:/addresses";
    }
}