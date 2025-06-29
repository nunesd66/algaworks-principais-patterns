package com.nunesd66.agenda;

import com.nunesd66.contato.Contato;

public class AgendaDAO implements Agenda {
	public void inserir(Contato contato) {
		// aqui vai uma inserção, necessário add patterns para tipos de inserção e afins
		System.out.println("função de inserir do AgendaDAO");
	}
	
	public Contato buscar(int codigo) {
		// simula a busca do contato
		System.out.println("função de buscar do AgendaDAO");
		
		return null;
	}
}
