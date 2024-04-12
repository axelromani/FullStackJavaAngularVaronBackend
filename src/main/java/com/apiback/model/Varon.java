package com.apiback.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "tb_varon")
public class Varon {
	
	@Id
	@GeneratedValue
	@Column(name = "varon_id")
	private int id;
	
	
	@Column(name = "varon_nombre")
	@NotEmpty
	private String nombre;
	
	
	@Column(name = "varon_apellido")
	@NotEmpty
	private String apellido;
	
	
	@Column(name = "varon_direccion")
	@NotEmpty
	private String direccion;
	
	
	@Column(name = "varon_telefono")
	@NotEmpty
	@Pattern(regexp="[0-9]{9}")
	private String telefono;

	
	@Column(name = "varon_email")
	@NotEmpty
	@Email
	private String email;
	
	
	@ManyToOne
	@JoinColumn(name="pais_id", nullable = false)
	@NotNull
	//@JsonManagedReference
	//JsonIgnore -> le pongo p q funcoones mi listado y grabar en ANGULAR -> NO FUNCIONA ni en ANGULAR ni POSTMAN
	private Pais pais;
	
	

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


	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	
	
	
	
	
	
	
	

}
