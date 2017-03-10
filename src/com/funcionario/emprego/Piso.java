package com.funcionario.emprego;

import java.util.ArrayList;
import java.util.List;

public class Piso {
	private Long id;
	private String sigla;
	private List<Salario> salarios = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public List<Salario> getSalarios() {
		return salarios;
	}

	public void setSalarios(List<Salario> salarios) {
		this.salarios = salarios;
	}

}
