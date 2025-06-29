package com.nunesd66;

import java.util.List;

import com.nunesd66.leitorarquivo.LeitorArquivo;
import com.nunesd66.leitorarquivo.LeitorArquivoXML;
import com.nunesd66.listener.EntregaListener;
import com.nunesd66.listener.FaturamentoListener;
import com.nunesd66.listener.Listener;
import com.nunesd66.notifier.NotificadorVenda;
import com.nunesd66.notifier.NotificadorVendaImpl;
import com.nunesd66.pedido.Pedido;

public class ObserverVendas {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// simulacao de algum request...
		LeitorArquivo leitorArquivo = new LeitorArquivoXML();
		List<Pedido> pedidos = leitorArquivo.getPedidos();
		
		// instanciacao do observer
		NotificadorVenda notificadorVenda = new NotificadorVendaImpl();
		Listener faturamentoListener = new FaturamentoListener(notificadorVenda);
		Listener entregaListener = new EntregaListener(notificadorVenda);
		
		// lancar o evento
		notificadorVenda.lancarVendas(pedidos);
	}

}
