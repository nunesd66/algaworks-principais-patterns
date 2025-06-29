package com.nunesd66.venda.boleta;

import java.math.BigDecimal;
import java.util.List;

import com.nunesd66.venda.itemPedido.ItemPedido;

public interface Boleta {
	public void emitirBoleta(BigDecimal impostoProdutos, List<ItemPedido> itensPedido);
}
