package com.funcionario.emprego;

import java.util.ArrayList;
import java.util.List;

public class Salario {
	private Long id;
	private String valor;
	private String posicao;
	private Categoria categorias;
	private Piso pisos;
	private List<FolhaPagamento> folhas = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public Categoria getCategorias() {
		return categorias;
	}

	public void setCategorias(Categoria categorias) {
		this.categorias = categorias;
	}

	public Piso getPisos() {
		return pisos;
	}

	public void setPisos(Piso pisos) {
		this.pisos = pisos;
	}

	public List<FolhaPagamento> getFolhas() {
		return folhas;
	}

	public void setFolhas(List<FolhaPagamento> folhas) {
		this.folhas = folhas;
	}
	

}
