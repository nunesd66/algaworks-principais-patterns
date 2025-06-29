package com.nunesd66.entity;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public abstract class NotaFiscal {
	
	private String numero;
	private Date dataEmissao;
	private List<ItemNotaFiscal> itens;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public List<ItemNotaFiscal> getItens() {
		return itens;
	}

	public void setItens(List<ItemNotaFiscal> itens) {
		this.itens = itens;
	}

	public BigDecimal getValorTotalNF() {
		BigDecimal valorTotalNF = new BigDecimal(0.0);
		for (ItemNotaFiscal item : itens) {
			valorTotalNF = valorTotalNF.add(item.getValorTotal());
		}
		return valorTotalNF;
	}
	
	public abstract BigDecimal getValorTotalComImpostos();
	
}
