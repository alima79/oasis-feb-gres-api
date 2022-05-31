package oasis.feb.reservasrestaurantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import oasis.feb.reservasrestaurantes.model.Particular;

@RepositoryRestResource(collectionResourceRel = "particulares", path = "particulares")
public interface ParticularRepository extends JpaRepository<Particular, Long>{

}
