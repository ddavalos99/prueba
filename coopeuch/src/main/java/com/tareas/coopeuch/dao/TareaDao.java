package com.tareas.coopeuch.dao;

import java.util.List;
import java.util.Optional;

import com.tareas.coopeuch.model.Tarea;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaDao extends CrudRepository<Tarea, Integer> {
	
	Tarea findByDescripcion(String descripcion);

}
