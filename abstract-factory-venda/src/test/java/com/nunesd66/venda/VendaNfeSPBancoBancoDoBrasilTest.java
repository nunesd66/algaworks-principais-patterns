package com.nunesd66.venda;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.nunesd66.venda.itemPedido.ItemPedido;
import com.nunesd66.venda.itemPedido.ItemPedidoBuilder;

public class VendaNfeSPBancoBancoDoBrasilTest {

	private List<ItemPedido> itens;
	private Venda venda;
	
	@Before
	public void before() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		ItemPedido i1 = new ItemPedidoBuilder()
				.nome("item1")
				.descricao("desc item 1")
				.quantidade(10)
				.valorUnitario(new BigDecimal(15.99))
				.construir();

		ItemPedido i2 = new ItemPedidoBuilder()
				.nome("item2")
				.descricao("desc item 2")
				.quantidade(20)
				.valorUnitario(new BigDecimal(15.99))
				.construir();
		

		ItemPedido i3 = new ItemPedidoBuilder()
				.nome("item3")
				.descricao("desc item 3")
				.quantidade(30)
				.valorUnitario(new BigDecimal(15.99))
				.construir();

		this.itens = List.of(i1, i2, i3);
		
		ModuloVendaFactory moduloFactory = new ConfigVenda();
		this.venda = new Venda(moduloFactory);
	}
	
	@Test
	public void realizarVenda() {
		this.venda.gerarNFe(this.itens);
		this.venda.emitirBoleta(this.itens);
	}
	
}
