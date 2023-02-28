package cartelera.services.impl;

import cartelera.entities.Cinema;
import cartelera.entities.Room;
import cartelera.repositories.CinemaRepository;
import cartelera.services.IAddressService;
import cartelera.services.ICinemaService;
import cartelera.services.IRoomService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static cartelera.utils.Utils.invalidPosNumber;

@Slf4j
@AllArgsConstructor
@Service

public class CinemaServiceImpl implements ICinemaService {

    private final CinemaRepository cinemaRepo;
    private final IRoomService roomService;
    private final IAddressService addressService;

    @Override
    public List<Cinema> findAll() {
        return cinemaRepo.findAll();
    }

    @Override
    public Optional<Cinema> findById(Long id) {
        log.info("findById {}", id);
        if (invalidPosNumber(id)) return Optional.empty();
        return cinemaRepo.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        log.info("existsById {}", id);
        if (invalidPosNumber(id)) return false;
        return cinemaRepo.existsById(id);
    }

    @Override
    public Cinema save(Cinema cinema) {
        log.info("save {}", cinema);
        return cinemaRepo.save(cinema);
    }

    @Override
    public void deleteById(Long id) {
        log.info("deleteById {}", id);

        if (invalidPosNumber(id) && !existsById(id)) return;

        // borrar todas las rooms asociadas
        List<Room> rooms = roomService.findAllByCinemaId(id);
        if (!rooms.isEmpty()) for (Room room : rooms) roomService.deleteById(room.getId());

        // desasociar la dirección asociada
        Long addressId = cinemaRepo.findById(id).get().getAddress().getId();
        if (addressService.existsById(addressId)) addressService.deleteById(addressId);

        cinemaRepo.deleteById(id);
    }
}
