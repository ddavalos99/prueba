package com.tareas.prueba.dao;

import java.util.List;
import java.util.Optional;

import com.tareas.prueba.model.Tarea;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaDao extends CrudRepository<Tarea, Integer> {
	
	Tarea findByDescripcion(String descripcion);

}
