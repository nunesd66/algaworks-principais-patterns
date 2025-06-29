package com.nunesd66.filme;

import java.time.LocalDate;

import jakarta.enterprise.context.Dependent;

@Dependent
public class FilmeBuilder {

	private Filme instancia;
	
	public FilmeBuilder() {
		this.instancia = new Filme();
	}
	
	public FilmeBuilder nome(String nome) {
		this.instancia.setNome(nome);
		return this;
	}
	
	public FilmeBuilder dataLancamento(LocalDate dataLancamento) {
		this.instancia.setDataLancamento(dataLancamento);
		return this;
	}
	
	public Filme construir() {
		return this.instancia;
	}
	
}
