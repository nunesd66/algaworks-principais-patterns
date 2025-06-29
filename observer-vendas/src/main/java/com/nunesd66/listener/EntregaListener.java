package com.nunesd66.listener;

import java.util.List;

import com.nunesd66.notifier.NotificadorVenda;
import com.nunesd66.pedido.Pedido;

public class EntregaListener implements Listener {

	private NotificadorVenda notificadorVenda;
	
	public EntregaListener(NotificadorVenda notificadorVenda) {
		this.notificadorVenda = notificadorVenda;
		this.notificadorVenda.registrarListener(this);
	}
	
	@Override
	public void atualizar() {
		List<Pedido> pedidos = notificadorVenda.getPedidos();

		for (Pedido pedido : pedidos) {
			System.out.println("notificar venda do item para entrega: " + pedido.getDescricao());
		}
		
	}

}
