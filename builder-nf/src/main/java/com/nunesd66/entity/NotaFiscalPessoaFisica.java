package com.nunesd66.entity;

import java.math.BigDecimal;

public class NotaFiscalPessoaFisica extends NotaFiscal {
	private static final Double FATOR_MULT_IMPOSTO_CPF = 107.00;

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public BigDecimal getValorTotalComImpostos() {
		return getValorTotalNF().multiply(new BigDecimal(FATOR_MULT_IMPOSTO_CPF));
	}
	
}
