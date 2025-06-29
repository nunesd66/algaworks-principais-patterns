package com.nunesd66.strategy.calculadorapremioseguro;

import com.nunesd66.cliente.Cliente;

public interface CalculadoraPremioSeguro {
	public double calcular(Cliente cliente, double valorVeiculo);
}
