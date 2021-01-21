package com.tareas.coopeuch.controller;

import com.tareas.coopeuch.model.ApiResponse;
import com.tareas.coopeuch.model.Tarea;
import com.tareas.coopeuch.model.TareaDto;
import com.tareas.coopeuch.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/tareas")
public class TareaController {

		@Autowired
	    private TareaService tareaService;

	    @PostMapping
	    public ApiResponse<Tarea> saveTarea(@RequestBody TareaDto tarea){
	        return new ApiResponse<>(HttpStatus.OK.value(), "Tarea guardada satisfactoriamente.",tareaService.save(tarea));
	    }

	    @GetMapping
	    public ApiResponse<List<Tarea>> listTarea(){
	        return new ApiResponse<>(HttpStatus.OK.value(), "Tarea listada obtenida satisfactoriamente.",tareaService.findAll());
	    }

	    @GetMapping("/{id}")
	    public ApiResponse<Tarea> getOne(@PathVariable int id){
	        return new ApiResponse<>(HttpStatus.OK.value(), "Tarea obtenida satisfactoriamente.",tareaService.findById(id));
	    }

	    @PutMapping("/{id}")
	    public ApiResponse<TareaDto> update(@RequestBody TareaDto tareaDto) {
	        return new ApiResponse<>(HttpStatus.OK.value(), "Tarea actualizada satisfactoriamente.",tareaService.update(tareaDto));
	    }

	    @DeleteMapping("/{id}")
	    public ApiResponse<Void> delete(@PathVariable int id) {
	    	tareaService.delete(id);
	        return new ApiResponse<>(HttpStatus.OK.value(), "Tarea eliminada Satisfactoriamente.", null);
	    }
}