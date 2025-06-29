package com.nunesd66.venda.boleta.caixa;

import java.math.BigDecimal;
import java.util.List;

import com.nunesd66.venda.boleta.Boleta;
import com.nunesd66.venda.itemPedido.ItemPedido;

public class CaixaBoleta implements Boleta {

	@Override
	public void emitirBoleta(BigDecimal impostoProdutos, List<ItemPedido> itensPedido) {
		System.out.println("simulacao da geracao de uma boleta para o branco CAIXA...");
		System.out.println("imposto: " + impostoProdutos);
		System.out.println(itensPedido.stream().map(ItemPedido::getDescricao).toList());
		System.out.println("outras informacoes mockadas e etc...");
		System.out.println("sucesso da simulacao de uma boleta para o branco CAIXA...");
	}

}
