package com.asteci.api.controllers;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.asteci.api.entity.Incidencia;
import com.asteci.api.entity.Operador;
import com.asteci.api.service.IIncidencia;

@RestController
@RequestMapping("/incidencia")
public class IncidenciaController {
	
	@Autowired 
	private IIncidencia incidenciaService;

	@PostMapping("/add")
	@ResponseStatus
	public void addIncidencia(@RequestBody Incidencia incidencia) {
		
		incidenciaService.save(incidencia);
		
	}
	
	@GetMapping("/resueltos")
		List<Incidencia> getIncidenciasResueltas(){
		List<Incidencia> lista = new LinkedList<Incidencia>();
		System.out.println("list True");
		lista = incidenciaService.findByStatusTrue();
		
		return lista;
	}
		
	
	@GetMapping("/pendientes")
	List<Incidencia> getIncidenciasPendientes(){
	List<Incidencia> lista = new LinkedList<Incidencia>();
	System.out.println("list True");
	lista = incidenciaService.findByStatusFalse();
	
	return lista;
}
	
	@GetMapping("incidencia/{id}")
	public Incidencia getIncidencia(@PathVariable Long id) {
		return incidenciaService.findById(id);
	}
		
	
	

}
