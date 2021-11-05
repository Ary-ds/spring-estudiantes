package ary.spring.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ary.spring.persona.model.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

}
