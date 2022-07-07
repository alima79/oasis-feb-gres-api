package oasis.feb.reservasrestaurantes.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import oasis.feb.reservasrestaurantes.model.Cliente;
import oasis.feb.reservasrestaurantes.model.Hospede;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "hospedes", path = "hospedes")
public interface HospedeRepository extends JpaRepository<Hospede, Long>{

	Page<Hospede> findById(Long id, Pageable pageable);
	
	Page<Hospede> findByNacionalidade(String nacionalidade, Pageable pageable);
	
	Page<Hospede> findByNumeroQuarto(Integer numeroQuarto, Pageable pageable);
	
	Page<Hospede> findByClienteId(Long id, Pageable pageable);
}
