package com.tareas.prueba.model;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

public class TareaDto {

	@ApiModelProperty(position = 0)
	private int id;
	@ApiModelProperty(position = 1)
    private String descripcion;
	@ApiModelProperty(position = 2)
    private Date fechaCreacion;
	@ApiModelProperty(position = 3)
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