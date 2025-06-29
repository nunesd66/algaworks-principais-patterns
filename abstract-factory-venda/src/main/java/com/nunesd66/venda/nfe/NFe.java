package com.nunesd66.venda.nfe;

import java.math.BigDecimal;
import java.util.List;

import com.nunesd66.venda.itemPedido.ItemPedido;

public interface NFe {
	public BigDecimal calculoImpostoProdutos(List<ItemPedido> itensPedido);
	public Boolean gerarNota(List<ItemPedido> itensPedido);
}
