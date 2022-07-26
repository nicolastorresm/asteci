package com.asteci.api.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Incidencia implements Serializable {
	/*
	 * La empresa XYZ es la encargada de administrar el reporte de incidencias de los equipos de
cómputo, donde un operador puede dar de alta una incidencia (“definir los datos que
consideres más importante ”), consultar incidencias por ID, por día , y por operador que
las dio de alta , 

cabe mencionar que debemos tener dashboards que representen 
número de peticiones a los servicios consultados , 
insertados , 
cuantos se resolvieron , 
cuantos
están abiertos.

Guardar incidencia ,,, con operador -> 
consultar status
consultar cuantos con status en true
consultar cuantos con status en false
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Temporal(TemporalType.DATE)
	private Date fechaCreacion;
		
	private String descripcion;
	
	@JsonIgnoreProperties(value={"incidencia","hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch =  FetchType.LAZY)
	private Operador operador;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Operador getOperador() {
		return operador;
	}

	public void setOperador(Operador operador) {
		this.operador = operador;
	}

	public Incidencia() {
		fechaCreacion = new Date();
	}
	
	

}
