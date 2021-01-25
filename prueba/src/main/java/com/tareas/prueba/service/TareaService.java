package com.tareas.prueba.service;

import com.tareas.prueba.model.Tarea;
import com.tareas.prueba.model.TareaDto;

import java.util.List;

public interface TareaService {
	
	Tarea save(TareaDto tarea);
    
	List<Tarea> findAll();
    
	void delete(int id);

    Tarea findOne(String descripcion);

    Tarea findById(int id);

    TareaDto update(TareaDto tareaDto);

}