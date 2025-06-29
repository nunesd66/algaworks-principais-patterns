package com.nunesd66.venda;

import java.io.IOException;
import java.util.Properties;

import com.nunesd66.venda.boleta.Boleta;
import com.nunesd66.venda.nfe.NFe;

public class ConfigVenda implements ModuloVendaFactory {

	private Properties prop;
	private NFe nfe;
	private Boleta boleta;
	
	@SuppressWarnings("deprecation")
	public ConfigVenda() throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		this.prop = new Properties();
		this.prop.load(this.getClass().getResourceAsStream("/config.properties"));
		
		this.nfe = (NFe) Class.forName(this.prop.getProperty("nfe")).newInstance();
		
		this.boleta = (Boleta) Class.forName(this.prop.getProperty("boleta")).newInstance();
	}

	@Override
	public Boleta criarBoleta() {
		return this.boleta;
	}

	@Override
	public NFe criarNFe() {
		return this.nfe;
	}

}
