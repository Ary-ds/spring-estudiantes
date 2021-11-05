package ary.spring.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ary.spring.persona.model.Estudiante;

@Repository            //creamos la interface que depende de jpa para crea el crud
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

}
