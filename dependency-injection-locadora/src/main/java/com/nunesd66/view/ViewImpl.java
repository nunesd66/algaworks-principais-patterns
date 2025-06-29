package com.nunesd66.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import com.nunesd66.filme.Filme;
import com.nunesd66.filme.FilmeBuilder;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ViewImpl implements View {

	@Inject
    private FilmeBuilder filmeBuilder;
	
	@Override
	public Filme inputFilme() {
		final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String nomeFilme = JOptionPane.showInputDialog("Digite o nome do filme:");
		String dataLancamentoStr = JOptionPane.showInputDialog("Digite o a data de lançamento do filme (dd/MM/yyyy):");
	
		LocalDate dataLancamentoLd = LocalDate.parse(dataLancamentoStr, dtf);
		
		return filmeBuilder
				.nome(nomeFilme)
				.dataLancamento(dataLancamentoLd)
				.construir();
	}

}
