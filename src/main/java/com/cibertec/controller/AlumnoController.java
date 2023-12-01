package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.entity.Alumno;
import com.cibertec.service.AlumnoService;

@RestController
@RequestMapping("/rest/alumno")
public class AlumnoController {

	@Autowired
	private AlumnoService service;
	
	@GetMapping
	@ResponseBody
	public List<Alumno>listadoAlumnos(){
		return service.listarAlumnosOrdenados();
	}
}
