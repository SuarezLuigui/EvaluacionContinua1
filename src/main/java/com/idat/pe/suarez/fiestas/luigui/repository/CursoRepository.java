package com.idat.pe.suarez.fiestas.luigui.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.pe.suarez.fiestas.luigui.modelo.Cursos;

@Repository
public interface CursoRepository extends JpaRepository<Cursos, Integer >{

}
