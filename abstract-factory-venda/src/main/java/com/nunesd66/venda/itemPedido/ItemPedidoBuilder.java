package com.nunesd66.venda.itemPedido;

import java.math.BigDecimal;

public class ItemPedidoBuilder {
	private ItemPedido instancia;

	public ItemPedidoBuilder() {
		this.instancia = new ItemPedido();
	}
	
	public ItemPedidoBuilder nome(String nome) {
		this.instancia.setNome(nome);
		return this;
	}
	
	public ItemPedidoBuilder descricao(String descricao) {
		this.instancia.setDescricao(descricao);
		return this;
	}
	
	public ItemPedidoBuilder quantidade(Integer quantidade) {
		this.instancia.setQuantidade(quantidade);
		return this;
	}
	
	public ItemPedidoBuilder valorUnitario(BigDecimal valorUnitario) {
		this.instancia.setValorUnitario(valorUnitario);
		return this;
	}
	
	public ItemPedido construir() {
		return this.instancia;
	}
	
}