package oasis.feb.reservasrestaurantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import oasis.feb.reservasrestaurantes.model.RestauranteSeating;

@RepositoryRestResource(collectionResourceRel = "restaurante_seating", path = "restauranteSeating")
public interface RestauranteSeatingRepository extends JpaRepository<RestauranteSeating, Long>{

}
