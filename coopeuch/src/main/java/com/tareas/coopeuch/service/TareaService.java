package com.tareas.coopeuch.service;

import com.tareas.coopeuch.model.Tarea;
import com.tareas.coopeuch.model.TareaDto;

import java.util.List;

public interface TareaService {
	
	Tarea save(TareaDto tarea);
    
	List<Tarea> findAll();
    
	void delete(int id);

    Tarea findOne(String descripcion);

    Tarea findById(int id);

    TareaDto update(TareaDto tareaDto);

}