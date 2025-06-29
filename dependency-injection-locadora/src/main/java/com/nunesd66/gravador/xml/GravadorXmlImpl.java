package com.nunesd66.gravador.xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.nunesd66.filme.Filme;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.NoTypePermission;

public class GravadorXmlImpl implements GravadorXml {

	@Override
	public void gravarFilme(Filme filme) {
		XStream xstream = new XStream();
		this.setPermissoesXml(xstream);

		xstream.alias("filme", Filme.class);
		OutputStream out = null;
		
		try {
			out = new FileOutputStream(filme.getNome() + ".xml");
			xstream.toXML(filme, out);
		} catch(FileNotFoundException e) {
			 throw new RuntimeException("Erro salvando arquivo", e);
		}
	}

	private void setPermissoesXml(XStream xstream) {
	    // ** Segurança: bloqueia tudo por padrão **
	    xstream.addPermission(NoTypePermission.NONE);
	    // ** Libera apenas as classes do seu pacote de Contato **
	    xstream.allowTypesByWildcard(new String[]{
	        "com.nunesd66.maladireta.*",
	    });
	    // 3) Também libera List e ArrayList para que a coleção possa ser instanciada
	    xstream.allowTypes(new Class[]{
	        java.util.List.class,
	        java.util.ArrayList.class
	    });
	}

}
