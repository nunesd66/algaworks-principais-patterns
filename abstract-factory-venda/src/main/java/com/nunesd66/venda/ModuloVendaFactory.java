package com.nunesd66.venda;

import com.nunesd66.venda.boleta.Boleta;
import com.nunesd66.venda.nfe.NFe;

public interface ModuloVendaFactory {

	public Boleta criarBoleta();
	public NFe criarNFe();
	
}
