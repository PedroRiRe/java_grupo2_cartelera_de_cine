package proyecto2.com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import proyecto2.com.example.repositories.CinemaRepository;

@SpringBootApplication
public class App {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(App.class, args);
		CinemaRepository cinemaRepo = context.getBean(CinemaRepository.class);
	}

}
