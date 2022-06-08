package com.idat.pe.suarez.fiestas.luigui.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.pe.suarez.fiestas.luigui.modelo.Cursos;
import com.idat.pe.suarez.fiestas.luigui.repository.CursoRepository;
import com.idat.pe.suarez.fiestas.luigui.modelo.Cursos;
import com.idat.pe.suarez.fiestas.luigui.service.CursoService;

public class CursoServiceImpl implements CursoService  {

	@Autowired
	private CursoRepository repository;
	
	@Override
	public void guardarCurso(Cursos curso) {
		// TODO Auto-generated method stub
		repository.save(curso);

	}

	@Override
	public void actualizarCurso(Cursos curso) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(curso);

	}

	@Override
	public void eliminarCurso(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public List<Cursos> listarCursos() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Cursos obtenerCursoId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	

}
