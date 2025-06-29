package com.nunesd66.venda;

import java.math.BigDecimal;
import java.util.List;

import com.nunesd66.venda.boleta.Boleta;
import com.nunesd66.venda.itemPedido.ItemPedido;
import com.nunesd66.venda.nfe.NFe;

public class Venda {

	private Boleta boleta;
	private NFe nFe;
	BigDecimal impostoProdutos;
	
	public Venda(ModuloVendaFactory moduloVendaFactory) {
		this.boleta = moduloVendaFactory.criarBoleta();
		this.nFe = moduloVendaFactory.criarNFe();
	}
	
	public void gerarNFe(List<ItemPedido> itensPedido) {
		this.impostoProdutos = this.nFe.calculoImpostoProdutos(itensPedido);
		this.nFe.gerarNota(itensPedido);
	}
	
	public void emitirBoleta(List<ItemPedido> itensPedido) {
		this.boleta.emitirBoleta(this.impostoProdutos, itensPedido);
	}
	
}
