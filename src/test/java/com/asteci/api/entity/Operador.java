package com.asteci.api.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




 @Entity
public class Operador  implements Serializable{
	
	
	
	private static final long serialVersionUID = 4317353408583039074L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	private String apellido;
	
		
	@JsonIgnoreProperties(value={"operador","hibernateLazyInitializer", "handler"},allowSetters = true)
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "operador")
	private List<Incidencia> incidencia;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public List<Incidencia> getIncidencia() {
		return incidencia;
	}
	public void setIncidencia(List<Incidencia> incidencia) {
		this.incidencia = incidencia;
	}
	public Operador() {
		
	}
	
	
	

}
