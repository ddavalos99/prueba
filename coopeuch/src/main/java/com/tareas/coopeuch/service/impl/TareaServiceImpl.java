package com.tareas.coopeuch.service.impl;

import com.tareas.coopeuch.dao.TareaDao;
import com.tareas.coopeuch.model.Tarea;
import com.tareas.coopeuch.model.TareaDto;
import com.tareas.coopeuch.service.TareaService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Transactional
@Service(value = "tareaService")
public class TareaServiceImpl implements TareaService {
	
	@Autowired
	private TareaDao tareaDao;
	
	public List<Tarea> findAll() {
		List<Tarea> list = new ArrayList<>();
		tareaDao.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	@Override
	public void delete(int id) {
		tareaDao.deleteById(id);
	}

	@Override
	public Tarea findOne(String descripcion) {
		return tareaDao.findByDescripcion(descripcion);
	}

	@Override
	public Tarea findById(int id) {
		Optional<Tarea> optionalTarea = tareaDao.findById(id);
		return optionalTarea.isPresent() ? optionalTarea.get() : null;
	}

    @Override
    public TareaDto update(TareaDto tareaDto) {
        Tarea tarea = findById(tareaDto.getId());
        if(tarea != null) {
            BeanUtils.copyProperties(tareaDto, tarea, "descripcion", "vigente");
            tareaDao.save(tarea);
        }
        return tareaDto;
    }

    @Override
    public Tarea save(TareaDto tarea) {
	    Tarea newTarea = new Tarea();
	    newTarea.setDescripcion(tarea.getDescripcion());
	    newTarea.setFechaCreacion(tarea.getFechaCreacion());
	    newTarea.setVigente(tarea.getVigente());
        return tareaDao.save(newTarea);
    }

}