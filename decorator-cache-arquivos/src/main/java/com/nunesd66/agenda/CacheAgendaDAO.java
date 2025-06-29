package com.nunesd66.agenda;

import java.util.HashMap;
import java.util.Map;

import com.nunesd66.contato.Contato;

public class CacheAgendaDAO implements Agenda {

	private Map<Integer, Contato> contatos;
	private Agenda agenda;
	
	public CacheAgendaDAO(Agenda agenda) {
		this.contatos = new HashMap<>();
		this.agenda = agenda;
	}
	
	@Override
	public void inserir(Contato contato) {
		System.out.println("função de inserir do CacheAgendaDAO");
		this.agenda.inserir(contato);
	}

	@Override
	public Contato buscar(int codigo) {
		System.out.println("função de buscar do CacheAgendaDAO");
		
		if (contatos.containsKey(codigo)) {
			Contato contato = contatos.get(codigo);
			return contato;
		}

		Contato contatoSemCache = this.agenda.buscar(codigo);
		
		if (contatoSemCache != null) {
			contatos.put(contatoSemCache.getCodigo(), contatoSemCache);
			return contatoSemCache;	
		}
		
		return null;
	}

}
