package oasis.feb.reservasrestaurantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import oasis.feb.reservasrestaurantes.model.Grupo;

@RepositoryRestResource(collectionResourceRel = "grupos", path = "grupos")
public interface GrupoRepository extends JpaRepository<Grupo, Long>{

}
