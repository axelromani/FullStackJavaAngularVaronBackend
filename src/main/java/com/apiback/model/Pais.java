package com.apiback.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_pais")
public class Pais implements Serializable{
	
	
	@Id
	@GeneratedValue
	@Column(name = "pais_id")
	private int id;
	

	@Column(name = "pais_nombre")
	private String nombre;
	
	
	@OneToMany(mappedBy="pais")
	@JsonBackReference
	private List<Varon> varones;


	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public List<Varon> getVarones() {
		return varones;
	}
	public void setVarones(List<Varon> varones) {
		this.varones = varones;
	}
	
	

}
