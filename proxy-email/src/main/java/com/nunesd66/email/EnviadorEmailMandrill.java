package com.nunesd66.email;

import java.util.List;

public class EnviadorEmailMandrill implements EnviadorEmail {

	private List<String> emails;
	
	public EnviadorEmailMandrill(List<String> emails) {
		this.emails = emails;
	}

	@Override
	public void enviar(String mensagem) {
		System.out.println("enviando email...");
		
		for (String email : this.emails) {
			System.out.println("enviado para " + email);
		}
		
	}

}
