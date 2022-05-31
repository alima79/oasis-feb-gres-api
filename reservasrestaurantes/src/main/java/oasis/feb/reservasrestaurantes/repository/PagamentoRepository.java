package oasis.feb.reservasrestaurantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import oasis.feb.reservasrestaurantes.model.Pagamento;

@RepositoryRestResource(collectionResourceRel = "pagamentos", path = "pagamentos")
public interface PagamentoRepository extends JpaRepository<Pagamento, Long>{

}
