package com.nunesd66.notifier;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.nunesd66.listener.Listener;
import com.nunesd66.pedido.Pedido;

public class NotificadorVendaImpl implements NotificadorVenda {

	private Set<Listener> listeners;
	private List<Pedido> pedidos;
	
	public NotificadorVendaImpl() {
		this.listeners = new HashSet<>();
	}
	
	@Override
	public void registrarListener(Listener listener) {
		this.listeners.add(listener);
	}

	@Override
	public void removerListener(Listener listener) {
		this.listeners.remove(listener);
	}

	@Override
	public void notificarListeners() {
		for (Listener listener : listeners) {
			listener.atualizar();
		}
	}

	@Override
	public void lancarVendas(List<Pedido> pedidos) {
		this.pedidos = pedidos;
		this.notificarListeners();
	}

	@Override
	public List<Pedido> getPedidos() {
		return this.pedidos;
	}

}
