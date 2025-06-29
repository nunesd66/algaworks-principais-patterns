package com.nunesd66;

import com.nunesd66.bean.FilmeService;
import com.nunesd66.util.cdi.WeldContext;

public class Principal {

	public static void main(String[] args) {
		FilmeService filmeService = WeldContext.INSTANCE.getBean(FilmeService.class);
		filmeService.gravarDadosFilme();
	}

}
