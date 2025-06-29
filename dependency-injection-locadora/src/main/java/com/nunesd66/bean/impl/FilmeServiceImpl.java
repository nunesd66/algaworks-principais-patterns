package com.nunesd66.bean.impl;

import com.nunesd66.bean.FilmeService;
import com.nunesd66.filme.Filme;
import com.nunesd66.filme.FilmeBuilder;
import com.nunesd66.gravador.Gravador;
import com.nunesd66.view.View;

import jakarta.inject.Inject;

public class FilmeServiceImpl implements FilmeService {

	@Inject
	private View view;
	
	@Inject
	private Gravador gravador;
	
	@Inject
	private FilmeBuilder filmeBuilder;
	
	@Override
	public void gravarDadosFilme() {
		Filme filme = view.inputFilme();
		gravador.gravarFilme(filme);
	}
	
}
