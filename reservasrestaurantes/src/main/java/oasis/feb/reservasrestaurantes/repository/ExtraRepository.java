package oasis.feb.reservasrestaurantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import oasis.feb.reservasrestaurantes.model.Extra;

@RepositoryRestResource(collectionResourceRel = "extras", path = "extras")
public interface ExtraRepository extends JpaRepository<Extra, Long>{

}
