package com.apiback.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.apiback.service.IVaronService;
import com.apiback.model.Varon;

@RestController
@RequestMapping("/wsvaron")
public class RestVaronController {
	
	
	@Autowired
	private IVaronService varonService;
	
	
	@GetMapping
	public List<Varon> listarAlumnos(){
		return varonService.Listado();
	}
	/*---------------------------------------*/
	
	@GetMapping(value = "/{id}")
	public Varon obtenerAlumno(@PathVariable("id") Integer id){
		return varonService.ConsultaPorId(id);
	}
	/*---------------------------------------*/
	
	
	@PostMapping
	public void insertar(@RequestBody Varon var){
		varonService.GuardarActualizar(var);
	}
	/*---------------------------------------*/
	
	@PutMapping
	public void modificar(@RequestBody Varon var){
		varonService.GuardarActualizar(var);
	}
	/*---------------------------------------*/
	
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id){
		varonService.Eliminar(id);
	}
	
	
	
	

}
