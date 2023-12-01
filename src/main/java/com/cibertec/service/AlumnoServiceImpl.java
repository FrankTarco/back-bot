package com.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Alumno;
import com.cibertec.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService{

	@Autowired
	private AlumnoRepository repo;
	
	@Override
	public List<Alumno> listarAlumnosOrdenados() {
		// TODO Auto-generated method stub
		return repo.listaAlumnosOrdenados();
	}

}
