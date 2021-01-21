package com.tareas.coopeuch.model;

import java.util.Date;

import javax.persistence.*;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "tarea")
public class Tarea {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
	
    @Column
    @lombok.NonNull
    private String descripcion;
    
    @Column
    @lombok.NonNull
    private Date fechaCreacion;
    
    @Column
    @lombok.NonNull
    private Boolean vigente;
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Boolean getVigente() {
		return vigente;
	}
	public void setVigente(Boolean vigente) {
		this.vigente = vigente;
	}

}