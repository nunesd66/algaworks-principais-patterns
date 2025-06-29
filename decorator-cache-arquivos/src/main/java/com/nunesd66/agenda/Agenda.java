package com.nunesd66.agenda;

import com.nunesd66.contato.Contato;

public interface Agenda {
	public void inserir(Contato contato);
	public Contato buscar(int codigo);
}
