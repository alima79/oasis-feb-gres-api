package oasis.feb.reservasrestaurantes.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import oasis.feb.reservasrestaurantes.model.Cliente;


@RepositoryRestResource(collectionResourceRel = "clientes", path = "clientes")
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	Page<Cliente> findByNome(String nome, Pageable pageable);
	
	Page<Cliente> findByEmail(String email, Pageable pageable);
	
	
}
