package ary.spring.persona.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ary.spring.persona.model.Estudiante;
import ary.spring.persona.service.EstudianteService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")  //para hacer la conexion con el front-end
public class EstudianteController {
	
	@Autowired  //inyeccion de la clase 
	private EstudianteService estudianteService;
	
//	@GetMapping("/estudiante")
//	public List<Estudiante> obtenerEstudiante() {
//		List<Estudiante> listaEstudiantes = new ArrayList<>();
//		
//		Estudiante es = new Estudiante();
//		es.setId((long) 1);
//		es.setNombre("ivan");
//		es.setApellido("silva");
//		es.setEmail("ivan@gmail.com");
//		es.setNota(12.5);
//		
//		
//		Estudiante es1 = new Estudiante();
//		es1.setId((long) 2);
//		es1.setNombre("wilson");
//		es1.setApellido("agilar");
//		es.setEmail("wilson@gmail.com");
//		es1.setNota(16.5);
//		
//		
//		Estudiante es2 = new Estudiante();
//		es2.setId((long) 3);
//		es2.setNombre("naia");
//		es2.setApellido("rocha");
//		es.setEmail("naia@gmail.com");
//		es2.setNota(20);
//		
//		listaEstudiantes.add(es);
//		listaEstudiantes.add(es1);
//		listaEstudiantes.add(es2);
//		
//		return listaEstudiantes;
//		
//	}
	
	
	
	//creamos el endpoint para guardar el estudiante anotamos con el @Requestbody para hacer la convercion en json
	@PostMapping("/estudiantes")
	public Estudiante guardarEstudiante(@RequestBody Estudiante estudiante) {
		System.out.println(estudiante);
		estudianteService.guardar(estudiante);
		return estudiante;
	}
	
	
	//creamos el endpoint para ver la lista de estudiantes
	@GetMapping("/estudiantes")
	public List<Estudiante> verLista() {
		return estudianteService.findAll();
	}
	
	
	
//	@GetMapping("/estudiantes/{id}")
//	public Estudiante obtenerEstudiante(@PathVariable("id") Long id) {
//		return estudianteService.getOne(id); 
//	}
	
	
	//creamos el endpoint para obtner un estudiante  @pathVariable para defenir que paramentro va a recibir
	@GetMapping (value = "/estudiantes/{id}")
	private ResponseEntity<Optional<Estudiante>> obtenerEstudiante (@PathVariable ("id") Long id){
		return ResponseEntity.ok(estudianteService.findById(id));
	}
	
	
	//creamos en endpoint actualizar un estudiante @requestBody 
	@PutMapping("/estudiantes")
	public void actualizarEstudiante (@RequestBody Estudiante estudiante) {
		estudianteService.actualizarModificar(estudiante);
	}
	
	//creamos el endpoint eliminar
	@DeleteMapping(value = "/estudiantes/{id}")
	public void eliminar(@PathVariable("id") Long id ) {
		estudianteService.deleteById(id);
	}

}
