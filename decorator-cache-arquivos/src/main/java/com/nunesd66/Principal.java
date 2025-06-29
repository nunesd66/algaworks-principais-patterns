package com.nunesd66;

import com.nunesd66.agenda.Agenda;
import com.nunesd66.agenda.AgendaDAO;
import com.nunesd66.agenda.CacheAgendaDAO;

public class Principal {

	public static void main(String[] args) {		
		Agenda agenda = new CacheAgendaDAO(new AgendaDAO());

		agenda.inserir(null);
		agenda.buscar(0);
	}

}
