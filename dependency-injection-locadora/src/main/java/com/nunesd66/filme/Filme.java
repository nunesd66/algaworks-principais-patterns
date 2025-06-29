package com.nunesd66.filme;

import java.time.LocalDate;
import java.time.Period;

public class Filme {

	private String nome;
	private LocalDate dataLancamento;
	private TipoFilme tipoFilme;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(LocalDate dataLancamento) {
		this.calculaTipoFilme(dataLancamento);
		this.dataLancamento = dataLancamento;
	}

	public TipoFilme getTipoFilme() {
		this.calculaTipoFilme(this.dataLancamento);
		return tipoFilme;
	}
	private void setTipoFilme(TipoFilme tipoFilme) {
		this.tipoFilme = tipoFilme;
	}
	
	private void calculaTipoFilme(LocalDate dataLancamento) {
		LocalDate dataAtual = LocalDate.now();
		Period tempoLancamento = Period.between(dataLancamento, dataAtual);
		
		boolean menosUmAno = tempoLancamento.getYears() == 0;
		boolean menosTresMeses = tempoLancamento.getMonths() < 3;
		boolean filmeNovo = menosTresMeses && menosUmAno;
		
		TipoFilme tipo = filmeNovo ? TipoFilme.NOVO : TipoFilme.ANTIGO;
		setTipoFilme(tipo);
	}
	
}
