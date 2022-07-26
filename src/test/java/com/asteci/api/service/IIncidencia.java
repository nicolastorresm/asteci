package com.asteci.api.service;

import java.util.List;

import com.asteci.api.entity.Incidencia;

public interface IIncidencia {
void save (Incidencia incidencia);
	
	public List<Incidencia> findByStatusTrue();
	
	public List<Incidencia> findByStatusFalse();
	
	public Incidencia findById(Long id);

}
