package com.nunesd66.builder;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.nunesd66.entity.NotaFiscal;
import com.nunesd66.entity.NotaFiscalPessoaFisica;
import com.nunesd66.entity.NotaFiscalPessoaJuridica;
import com.nunesd66.entity.ItemNotaFiscal;

public class NotaFiscalBuilder {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private NotaFiscal instancia;

	public NotaFiscalBuilder() {
		this.instancia = null;
	}
	
	public NotaFiscalBuilder buildNotaFiscalPessoaFisica() {
		this.instancia = new NotaFiscalPessoaFisica();
		return this;
	}
	
	public NotaFiscalBuilder buildNotaFiscalPessoaJuridica() {
		this.instancia = new NotaFiscalPessoaJuridica();
		return this;
	}
	
	public NotaFiscalBuilder cpfCnpj(String ident) {
		if (instancia instanceof NotaFiscalPessoaFisica) {
			((NotaFiscalPessoaFisica) this.instancia).setCpf(ident);
		}
		if (instancia instanceof NotaFiscalPessoaJuridica) {
			((NotaFiscalPessoaJuridica) this.instancia).setCnpj(ident);
		}
		
		return this;
	}
	
	public NotaFiscalBuilder numero(String numero) {
		this.instancia.setNumero(numero);
		return this;
	}
	
	public NotaFiscalBuilder dataEmissao(Object dataEmissao) {
		if (dataEmissao instanceof Date) {
			this.instancia.setDataEmissao((Date)dataEmissao);
			return this;
		}
		if (dataEmissao instanceof String) {

			try {
			    Date data = sdf.parse((String)dataEmissao);
			    this.instancia.setDataEmissao(data);
			} catch (ParseException e) {
			    e.printStackTrace();
			}

			return this;
		}

		throw new IllegalArgumentException("A data de emissao deve ser do tipo Date ou String no formato dd/MM/yyyy.");
	}
	
	public NotaFiscalBuilder addItem(String nome, Integer quantidade, Object valor) {
		ItemNotaFiscal itemNF = new ItemNotaFiscal();
		itemNF.setNome(nome);
		itemNF.setQuantidade(quantidade);
		
		try {
			if (valor instanceof BigDecimal) {
				itemNF.setValorUnitario((BigDecimal)valor);
			} else 
			if (valor instanceof Double) {
				itemNF.setValorUnitario(new BigDecimal((Double)valor));
			} else 
			if (valor instanceof String) {
				itemNF.setValorUnitario(new BigDecimal((String)valor));
			} else {
				throw new IllegalArgumentException("O valor do produto deve ser do tipo BigDecimal, Double ou String válido.");
			}
	    } catch (NumberFormatException e) {
	    	throw new NumberFormatException("O valor em String deve seguir o padrao: '123456.78'."); 
	    } catch (IllegalArgumentException e) {
	    	throw new IllegalArgumentException("O valor do produto deve ser do tipo BigDecimal, Double ou String válido.");
	    }
		
		if (this.instancia.getItens() == null) {
			this.instancia.setItens(new ArrayList<>());
		}
		
		this.instancia.getItens().add(itemNF);
		
		return this;
	}
	
	public NotaFiscal construir() {
		return this.instancia;
	}
	
}
