package oasis.feb.reservasrestaurantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import oasis.feb.reservasrestaurantes.model.Utilizador;

@RepositoryRestResource(collectionResourceRel = "utilizadores", path = "utilizadores")
public interface UtilizadorRepository extends JpaRepository<Utilizador, Long>{

}
