package com.nunesd66.entity;

import java.math.BigDecimal;

public class NotaFiscalPessoaJuridica extends NotaFiscal {
	private static final Double FATOR_MULT_IMPOSTO_CNPJ = 104.00;
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public BigDecimal getValorTotalComImpostos() {
		return getValorTotalNF().multiply(new BigDecimal(FATOR_MULT_IMPOSTO_CNPJ));
	}
	
}
