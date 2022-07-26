package com.asteci.api.service;

import java.util.List;


import com.asteci.api.entity.Operador;


public interface IOperador {
	
		
	public List<Operador> findAll();
	public Operador findById (Long id);
	void save (Operador operador);
	
	
	
	
	
	

}
