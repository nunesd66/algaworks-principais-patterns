package com.nunesd66.email;

import java.util.ArrayList;
import java.util.List;

import com.nunesd66.contato.Contato;
import com.nunesd66.contato.ContatoRepository;

public class EnviandoEmailMandrillProxy implements EnviadorEmail {

	private EnviadorEmailMandrill enviadorEmailMandrill;
	
	public EnviandoEmailMandrillProxy(List<String> emails) {
		List<String> list = this.obterListaEmailsFiltrados(emails);
		this.enviadorEmailMandrill = new EnviadorEmailMandrill(list);
	}
	
	@Override
	public void enviar(String mensagem) {
		enviadorEmailMandrill.enviar(mensagem);
	}
	
	private List<String> obterListaEmailsFiltrados(List<String> listaEmails) {
		List<String> list = new ArrayList<>(listaEmails);
		List<String> listaNegra;

		listaNegra = new ContatoRepository().obterListaNegraEmails()
				.stream()
				.map(Contato::getEmail)
				.toList();

		
		list.removeAll(listaNegra);
		
		return list;
	}

}
