package cartelera;

import cartelera.entities.*;
import cartelera.entities.enums.Classification;
import cartelera.entities.enums.Gender;
import cartelera.repositories.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class App {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(App.class, args);

		var userRepo = context.getBean(UserRepository.class);
		var addressRepo = context.getBean(AddressRepository.class);
		var cineRepo = context.getBean(CinemaRepository.class);
		var roomRepo = context.getBean(RoomRepository.class);
		var filmRepo = context.getBean(FilmRepository.class);

		userRepo.saveAll(List.of(
				new User(null, "Aitor", "Tilla", null, "aitorem@il", "123456"),
				new User(null, "Fina", "Segura", null, "finaem@il", "654321"),
				new User(null, "Pedro", "Gadicto", null, "peterm@il", "412563"),
				new User(null, "Dolores", "Fuertes", null, "doloresem@il", "632541")
		));

		var address1 = new Address(null, "Callejón", "23654", "Bilbao", "España");
		var address2 = new Address(null, "Calle Cita", "41258", "Marbella", "España");
		var address3 = new Address(null, "Carrerón", "96587", "Lugo", "España");
		var address4 = new Address(null, "Carrerita", "12365", "Sevilla", "España");

		addressRepo.saveAll(List.of(address1, address2, address3, address4));

		var film1 = new Film(null, "Spiderman", 120, 2020, "uno", "EEUU", Classification.OLDER7,
				null, "otro", "photógrafo", "script", "Universal",
				null, Set.of(Gender.ACTION), null, null, null, null);
		var film2 = new Film(null, "Batman", 135, 2020, "uno", "EEUU", Classification.OLDER12,
				null, "otro", "photógrafo", "script", "Universal",
				null, Set.of(Gender.ACTION), null, null, null, null);
		var film3 = new Film(null, "Superman", 115, 2020, "uno", "EEUU", Classification.OLDER12,
				null, "otro", "photógrafo", "script", "Universal",
				null, Set.of(Gender.ACTION), null, null, null, null);
		var film4 = new Film(null, "X-Men", 122, 2020, "uno", "EEUU", Classification.ALL_AGES,
				null, "otro", "photógrafo", "script", "Universal",
				null, Set.of(Gender.ACTION), null, null, null, null);

		filmRepo.saveAll(List.of(film1, film2, film3, film4));

		var cinema1 = new Cinema(null, "54646546", "Barna", null, null, null, null,
				null, "456321", address1, null);
		var cinema2 = new Cinema(null, "546456", "Madrid", null, null, null, null,
				null, "2135", address2, null);
		var cinema3 = new Cinema(null, "546542132", "Málaga", null, null, null, null,
				null, "211216548", address3, null);
		var cinema4 = new Cinema(null, "8756412", "Sevilla", null, null, null, null,
				null, "2154", address4, null);

		cineRepo.saveAll(List.of(cinema1, cinema2, cinema3, cinema4));

		var room1 = new Room(null, (byte) 1, 130, true,
				LocalDate.of(2023, 2, 18), null, film1, cinema1);
		var room2 = new Room(null, (byte) 2, 130, true,
				LocalDate.of(2023, 2, 18), null, film1, cinema2);
		var room3 = new Room(null, (byte) 3, 130, true,
				LocalDate.of(2023, 2, 18), null, film2, cinema3);
		var room4 = new Room(null, (byte) 4, 130, true,
				LocalDate.of(2023, 2, 18), null, film2, cinema4);

		roomRepo.saveAll(List.of(room1, room2, room3, room4));
	}
}
