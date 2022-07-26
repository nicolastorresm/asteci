package com.asteci.api.entity.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.asteci.api.entity.Incidencia;

public interface IIncidenciaDao extends JpaRepository<Incidencia, Long>{

	
	@Query("select I from incidencia I where i.status=true")
	List<Incidencia> findByStatusTrue();
	
	@Query("select I from incidencia I where i.status=false")
	List<Incidencia> findByStatusFalse();
	
}
