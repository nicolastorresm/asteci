package com.asteci.api.controllers;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.asteci.api.entity.Operador;
import com.asteci.api.service.IOperador;

@RestController
@CrossOrigin
@RequestMapping("/operador")
public class OperadorController {
	
	@Autowired
	private IOperador operadorService;
	
	@PostMapping("/add")
	
	public void add (@RequestBody Operador operador){
		
		System.out.println("Add");
		operadorService.save(operador);
		
	}
	
	@GetMapping("/list")
	
	List<Operador> getOperador(){
		List<Operador> lista = new LinkedList<Operador>();
		System.out.println("list");
		lista = operadorService.findAll();
		
		return lista;
	}
	
	@GetMapping("operador/{id}")
	
	Operador getOperador(@PathVariable Long id) {
		return operadorService.findById(id);
	}

	
}
