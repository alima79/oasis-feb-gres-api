package oasis.feb.reservasrestaurantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import oasis.feb.reservasrestaurantes.model.Seating;

@RepositoryRestResource(collectionResourceRel = "seatings", path = "seatings")
public interface SeatingRepository extends JpaRepository<Seating, Long>{

}
