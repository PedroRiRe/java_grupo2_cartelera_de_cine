package proyecto2.com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto2.com.example.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}