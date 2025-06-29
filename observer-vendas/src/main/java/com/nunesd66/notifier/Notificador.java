package com.nunesd66.notifier;

import com.nunesd66.listener.Listener;

public interface Notificador {

	public void registrarListener(Listener listener);
	public void removerListener(Listener listener);
	public void notificarListeners();
	
}
