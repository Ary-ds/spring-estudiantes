package ary.spring.persona.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import ary.spring.persona.model.Estudiante;
import ary.spring.persona.repository.EstudianteRepository;

@Service
public class EstudianteService implements EstudianteRepository {
	
	@Autowired   //hacemos la inyecion de datos 
	private EstudianteRepository estudianteRepository;

	@Override
	public List<Estudiante> findAll() {
		// TODO Auto-generated method stub
		return estudianteRepository.findAll();
	}
	
	
	//creamos el metodo manualmente  para obtener la lista de estudiantes
//	public List<Estudiante> obtenerTodos() {
//		// TODO Auto-generated method stub
//		return estudianteRepository.findAll();
//	}
	
	
	

	@Override
	public List<Estudiante> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estudiante> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estudiante> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Estudiante> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Estudiante> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public Estudiante getOne(Long id) {
		// TODO Auto-generated method stub
		return estudianteRepository.getOne(id);
	}
	
	
	//creamos el metodo manualmente para obtener un estudiante
//	public Estudiante obtenerEstudiante(Long id) {
//		return estudianteRepository.getOne(id);
//	}
	

	@Override
	public <S extends Estudiante> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estudiante> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Estudiante> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

	@Override
	public <S extends Estudiante> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
   //creamos un metodo manualmente para guardar los estudiantes
	public void guardar(Estudiante estudiante) {
		estudianteRepository.save(estudiante);
	}
	
	
	//creamos el metodo para actualizar o modificar
	public void actualizarModificar(Estudiante estudiante) {
		estudianteRepository.save(estudiante);
	}
	
	
	
	
	
	
	

	@Override
	public Optional<Estudiante> findById(Long id) {
		// TODO Auto-generated method stub
		return estudianteRepository.findById(id);
	}
	
//  creamos el metodo manualmente para obtener el estudiante	
//	public List<Estudiante> findById(Long id) {
//	return estudianteRepository.findById(id);
//	}

	
	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		estudianteRepository.deleteById(id);
	}
	
	//creamos el metodo de eliminar manualmente 
//	public void eliminar(Long id) {
//		// TODO Auto-generated method stub
//		estudianteRepository.deleteById(id);
//	}
	
	
	

	@Override
	public void delete(Estudiante entity) {
		// TODO Auto-generated method stub
     
	}

	@Override
	public void deleteAll(Iterable<? extends Estudiante> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Estudiante> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estudiante> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estudiante> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Estudiante> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
