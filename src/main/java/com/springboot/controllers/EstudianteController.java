package com.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.springboot.models.dao.EstudianteDaoImpl;
import com.springboot.models.entitys.Estudiante;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
public class EstudianteController {
	@Autowired
	private EstudianteDaoImpl dao;
	
	@GetMapping("/listado")
	public String listado(Model modelo) {
		List<Estudiante> lista = dao.listar();
		modelo.addAttribute("listaEstudiantes", lista);
		return "listado";
	}
	
	@GetMapping("/nuevo")
	public String nuevo(Model modelo) {
		modelo.addAttribute("estudiante", new Estudiante());
		return "nuevo";
	}
	
	@PostMapping("/guardar")
	public String guardar(Estudiante est) {
		dao.guardar(est);
		return "redirect:/listado";
	}
	
	@GetMapping("/borrar/{id}")
	public String borrar(@PathVariable("id") int id) {
		dao.borrar(id);
		return "redirect:/listado";
	}

	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model modelo) {
		Estudiante est = dao.buscarID(id);
		modelo.addAttribute("estudiante",est);
		return "editar";
	}
	
	@PostMapping("/actualizar")
	public String actualizar(Estudiante est) {
		dao.actualizar(est);
		return "redirect:/listado";
	}
	
	
}
