package com.cibertec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cibertec.entity.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{
	
	@Query("select a from Alumno a order by a.nombre asc")
	public List<Alumno>listaAlumnosOrdenados();

}
