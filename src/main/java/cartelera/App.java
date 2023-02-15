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

@SpringBootApplication
public class App {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(App.class, args);
		var cineRepo = context.getBean(CinemaRepository.class);

		Room r1 = new Room(null, null, null, 130, true,
				LocalDate.of(2023, 2, 18), null, null);
		Room r2 = new Room(null, null, null, 130, true,
				LocalDate.of(2023, 2, 18), null, null);


		cineRepo.saveAll(List.of(
				new Cinema(null, "54646546", "barna", null, null, null,
						null, "456321", null, null, null),
				new Cinema(null, "546456", "madrid", null, null, null,
						null, "2135", null, null, null),
				new Cinema(null, "546542132", "malaga", null, null, null,
						null, "211216548", null, null, null),
				new Cinema(null, "8756412", "sevilla", null, null, null,
						null, "2154", null, null, null)
		));

		var addressRepo = context.getBean(AddressRepository.class);
		addressRepo.saveAll(List.of(
				new Address(null, "Callejon", "23654", "Bilbao", "Spain"),
				new Address(null, "Calle Cita", "41258", "Marbella", "Spain"),
				new Address(null, "Carreron", "96587", "Lugo", "Spain"),
				new Address(null, "Carrerita", "12365", "Sevilla", "Spain")
		));

		var filmRepo = context.getBean(FilmRepository.class);
		filmRepo.saveAll(List.of(
				new Film(null, "Spiderman", 120, "uno", "EEUU", Classification.OLDER7,
						null, "otro", "photografo", "script", "Universal",
						null, Collections.singleton(Gender.ACTION)),
				new Film(null, "Batman", 135, "uno", "EEUU", Classification.OLDER12,
						null, "otro", "photografo", "script", "Universal",
						null, Collections.singleton(Gender.ACTION)),
				new Film(null, "Superman", 115, "uno", "EEUU", Classification.OLDER12,
						null, "otro", "photografo", "script", "Universal",
						null, Collections.singleton(Gender.ACTION)),
				new Film(null, "X-Men", 122, "uno", "EEUU", Classification.ALL_AGES,
						null, "otro", "photografo", "script", "Universal",
						null, Collections.singleton(Gender.ACTION))
		));


		var roomRepo = context.getBean(RoomRepository.class);
		roomRepo.saveAll(List.of(
				new Room(null, null, null, 130, true,
						LocalDate.of(2023, 2, 18), null, null),
				new Room(null, null, null, 130, true,
						LocalDate.of(2023, 2, 18), null, null),
				new Room(null, null, null, 130, true,
						LocalDate.of(2023, 2, 18), null, null),
				new Room(null, null, null, 130, true,
						LocalDate.of(2023, 2, 18), null, null)
		));



		var userRepo = context.getBean(UserRepository.class);
		userRepo.saveAll(List.of(
				new User(null, "Aitor", "Tilla", null, "aitorem@il", "123456"),
				new User(null, "Fina", "Segura", null, "finaem@il", "654321"),
				new User(null, "Pedro", "Gadicto", null, "peterm@il", "412563"),
				new User(null, "Dolores", "Fuertes", null, "doloresem@il", "632541")
		));


	}

}
