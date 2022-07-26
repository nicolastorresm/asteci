package com.asteci.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asteci.api.entity.Incidencia;
import com.asteci.api.entity.dao.IIncidenciaDao;

@Service
public class IncidenciaImpl implements IIncidencia {
	
	@Autowired
	private IIncidenciaDao incidenciaDao;
	
	
	

	@Override
	public void save(Incidencia incidencia) {
		
		incidenciaDao.save(incidencia);

	}

	@Override
	public List<Incidencia> findByStatusTrue() {
		// TODO Auto-generated method stub
		return incidenciaDao.findByStatusTrue();
	}

	@Override
	public List<Incidencia> findByStatusFalse() {
		// TODO Auto-generated method stub
		return incidenciaDao.findByStatusTrue();
	}

	@Override
	public Incidencia findById(Long id) {
		// TODO Auto-generated method stub
		return incidenciaDao.findById(id).orElse(null);
	}

}
