package ary.spring.persona.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ary.spring.persona.model.Estudiante;

@RestController
public class EstudianteController {
	
	@GetMapping("/estudiante")
	public List<Estudiante> obtenerEstudiante() {
		List<Estudiante> listaEstudiantes = new ArrayList<>();
		
		Estudiante es = new Estudiante();
		es.setId((long) 1);
		es.setNombre("ivan");
		es.setApellido("silva");
		es.setEmail("ivan@gmail.com");
		es.setNota(12.5);
		
		
		Estudiante es1 = new Estudiante();
		es1.setId((long) 2);
		es1.setNombre("wilson");
		es1.setApellido("agilar");
		es.setEmail("wilson@gmail.com");
		es1.setNota(16.5);
		
		
		Estudiante es2 = new Estudiante();
		es2.setId((long) 3);
		es2.setNombre("naia");
		es2.setApellido("rocha");
		es.setEmail("naia@gmail.com");
		es2.setNota(20);
		
		listaEstudiantes.add(es);
		listaEstudiantes.add(es1);
		listaEstudiantes.add(es2);
		
		return listaEstudiantes;
		
	}

}
