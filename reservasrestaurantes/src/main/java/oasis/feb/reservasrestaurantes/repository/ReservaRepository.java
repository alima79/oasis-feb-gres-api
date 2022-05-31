package oasis.feb.reservasrestaurantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import oasis.feb.reservasrestaurantes.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long>{

}