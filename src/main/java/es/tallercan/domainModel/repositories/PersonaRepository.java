package es.tallercan.domainModel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.tallercan.domainModel.Persona.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
