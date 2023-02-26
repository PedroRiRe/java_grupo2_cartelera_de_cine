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

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
        return cinemaRepo.findById(id);
    }

    @Override
    public Cinema save(Cinema cinema) {
        return cinemaRepo.save(cinema);
    }

    @Override
    public void deleteById(Long id) {

        // borrar todas las rooms asociadas
        List<Room> rooms = roomService.findAllByCinemaId(id);
        List<Long> ids = new ArrayList<>();
        for (Room room : rooms)
            ids.add(room.getId());
        roomService.deleteAllById(ids);

        // borrar address asociada
        Optional<Cinema> cinemaOpt = findById(id);
        if (cinemaOpt.isPresent()) {
            Cinema cinema = cinemaOpt.get();
            Long addressId = cinema.getAddress().getId();
            cinema.setAddress(null);
            addressService.deleteById(addressId);
        }

        cinemaRepo.deleteById(id);
    }
}
