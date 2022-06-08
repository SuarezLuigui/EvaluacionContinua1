package com.idat.pe.suarez.fiestas.luigui.service;

import java.util.List;

import com.idat.pe.suarez.fiestas.luigui.modelo.Cursos;

public interface CursoService {
	
	void guardarCurso(Cursos curso);
	void actualizarCurso(Cursos curso);
	void eliminarCurso(Integer id);
	List<Cursos> listarCursos();
	Cursos obtenerCursoId(Integer id);

}
