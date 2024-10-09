package com.springboot.models.dao;

import java.util.List;

import com.springboot.models.entitys.Estudiante;

public interface IEstudianteDao {
	/*MÉTODOS CRUD*/
	public List<Estudiante>listar();
	public int guardar(Estudiante est);
	public int actualizar(Estudiante est);
	public int borrar(int id);
	public Estudiante buscarID(int id);
}
