package com.asteci.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asteci.api.entity.Operador;
import com.asteci.api.entity.dao.IOperadorDaos;


@Service
public class OperadorImpl implements IOperador{

	@Autowired
	private IOperadorDaos operadorDao;
	
	
	
	@Override
	public List<Operador> findAll() {
		// TODO Auto-generated method stub
		return (List<Operador>) operadorDao.findAll();
	}

	@Override
	public Operador findById(Long id) {
		// TODO Auto-generated method stub
		return operadorDao.findById(id).orElse(null);
	}

	@Override
	public void save(Operador operador) {
		// TODO Auto-generated method stub
		operadorDao.save(operador);
	}
	
}
