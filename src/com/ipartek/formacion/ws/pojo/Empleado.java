package com.ipartek.formacion.ws.pojo;

import java.io.Serializable;

public class Empleado implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + this.id + ", nombre=" + this.nombre + ", apellido=" + this.apellido + ", email="
				+ this.email + ", telefono=" + this.telefono + "]";
	}

}
