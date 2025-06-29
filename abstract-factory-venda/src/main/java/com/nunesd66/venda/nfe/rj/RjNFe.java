package com.nunesd66.venda.nfe.rj;

import java.math.BigDecimal;
import java.util.List;

import com.nunesd66.venda.itemPedido.ItemPedido;
import com.nunesd66.venda.nfe.NFe;

public class RjNFe implements NFe {

	private static final BigDecimal VALOR_IMPOSTO_FICTICIO = new BigDecimal(0.07);
	
	@Override
	public BigDecimal calculoImpostoProdutos(List<ItemPedido> itensPedido) {
		BigDecimal valorImpostoCalculado = BigDecimal.ZERO;
		
		for(ItemPedido itemPedido : itensPedido) {
			BigDecimal valorTotalItem = itemPedido.getValorUnitario().multiply(new BigDecimal(itemPedido.getQuantidade()));
			BigDecimal valorImpostoItem = valorTotalItem.multiply(VALOR_IMPOSTO_FICTICIO);
			valorImpostoCalculado = valorImpostoCalculado.add(valorImpostoItem);
		}
		
		return valorImpostoCalculado;
	}

	@Override
	public Boolean gerarNota(List<ItemPedido> itensPedido) {
		System.out.println("simulacao da geracao de uma nfe para SP...");
		System.out.println("sucesso da simulacao da geracao de uma nfe para SP...");
		return true;
	}

}
