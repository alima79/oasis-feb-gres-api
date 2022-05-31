package oasis.feb.reservasrestaurantes.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import oasis.feb.reservasrestaurantes.model.Estado;

@RepositoryRestResource(collectionResourceRel = "estados", path = "estados")
public interface EstadoRepository extends JpaRepository<Estado, Long>{

	Page<Estado> findByValor(String valor, Pageable pageable);
}
