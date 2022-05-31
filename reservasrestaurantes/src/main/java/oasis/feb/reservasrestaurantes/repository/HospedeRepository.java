package oasis.feb.reservasrestaurantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import oasis.feb.reservasrestaurantes.model.Hospede;

@RepositoryRestResource(collectionResourceRel = "hospedes", path = "hospedes")
public interface HospedeRepository extends JpaRepository<Hospede, Long>{

}
