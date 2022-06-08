package com.idat.pe.suarez.fiestas.luigui.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Clientes")
public class Profesor {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer IdProfesor;
	private String Profesor;
	
	
	
	public Integer getIdProfesor() {
		return IdProfesor;
	}
	public void setIdProfesor(Integer idProfesor) {
		IdProfesor = idProfesor;
	}
	public String getProfesor() {
		return Profesor;
	}
	public void setProfesor(String profesor) {
		Profesor = profesor;
	}

	
	
}
