package oasis.feb.reservasrestaurantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import oasis.feb.reservasrestaurantes.model.Restaurante;

@RepositoryRestResource(collectionResourceRel = "restaurantes", path = "restaurantes")
public interface RestauranteRepository extends JpaRepository<Restaurante, Long>{

}
