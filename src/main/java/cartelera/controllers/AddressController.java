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
        if (addresses != null) model.addAttribute("addresses", addresses);
        else model.addAttribute("warning", "Empty list.");
        return "addresses-list";
    }

    @GetMapping("/address/{id}")
    public String findById(Model model, @PathVariable Long id) {
        Optional<Address> address = addressService.findById(id);
        if (address.isPresent()) model.addAttribute("address", address.get());
        else model.addAttribute("error", "404 Address Not Found");
        return "address-detail";
    }
}