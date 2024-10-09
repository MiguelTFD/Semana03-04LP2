package com.springboot.models.entitys;

public class Estudiante {
	private int idestudiante;
	private String nombre;
	private String apellido;
	private String telefono;
	private String correo;
	
	public Estudiante() {
	}
	public Estudiante(int idestudiante, String nombre, String apellido, String telefono, String correo) {
		this.idestudiante = idestudiante;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
	}
	
	public int getIdestudiante() {
		return idestudiante;
	}
	public void setIdestudiante(int idestudiante) {
		this.idestudiante = idestudiante;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}