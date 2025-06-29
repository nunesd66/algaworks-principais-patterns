package com.nunesd66.notifier;

import java.util.List;

import com.nunesd66.pedido.Pedido;

public interface NotificadorVenda extends Notificador {
	
	public void lancarVendas(List<Pedido> pedidos);
	public List<Pedido> getPedidos();

}
