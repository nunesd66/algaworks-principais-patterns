package com.nunesd66.email;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class EnviandoEmailMandrillTest {

	List<String> emailsList;
	
	@Before
	public void before() {
		emailsList =  new ArrayList<>();
		emailsList.add("joao@email.com");
		emailsList.add("maria@email.com");
		emailsList.add("renato@email.com");
		emailsList.add("aparecer1@email.com");
		emailsList.add("aparecer2@email.com");

	}
	
	@Test
	public void enviandoEmailBarrando() {
		EnviandoEmailMandrillProxy enviarEmails = new EnviandoEmailMandrillProxy(this.emailsList);
		enviarEmails.enviar("msg teste");
	}
	
}
