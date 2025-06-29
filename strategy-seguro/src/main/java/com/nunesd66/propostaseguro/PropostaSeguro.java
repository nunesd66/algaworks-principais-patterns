package com.nunesd66.propostaseguro;

import com.nunesd66.cliente.Cliente;
import com.nunesd66.strategy.calculadorapremioseguro.CalculadoraPremioSeguro;

public class PropostaSeguro {

	private CalculadoraPremioSeguro calculadora;
	private Cliente cliente;
	private double valorVeiculo;
	
	public PropostaSeguro(Cliente cliente, double valorVeiculo) {
		this.cliente = cliente;
		this.valorVeiculo = valorVeiculo;
	}

	public String gerar() {
		return "proposta: " + calculadora.calcular(cliente, valorVeiculo);
	}
	
	public void setCalculadora(CalculadoraPremioSeguro calculadora) {
		this.calculadora = calculadora;
	}
	
}
