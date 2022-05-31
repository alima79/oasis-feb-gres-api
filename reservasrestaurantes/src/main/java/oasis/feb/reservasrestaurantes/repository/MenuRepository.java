package oasis.feb.reservasrestaurantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import oasis.feb.reservasrestaurantes.model.Menu;

@RepositoryRestResource(collectionResourceRel = "menus", path = "menus")
public interface MenuRepository extends JpaRepository<Menu, Long>{

}
