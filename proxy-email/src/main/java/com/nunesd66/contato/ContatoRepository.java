package com.nunesd66.contato;

import java.net.URL;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.NoTypePermission;

public class ContatoRepository {

	@SuppressWarnings("unchecked")
	public List<Contato> obterListaNegraEmails() {
		XStream xstream = new XStream();
		
	    // ** Segurança: bloqueia tudo por padrão **
	    xstream.addPermission(NoTypePermission.NONE);
	    // ** Libera apenas as classes do seu pacote de Contato **
	    xstream.allowTypesByWildcard(new String[]{
	        "com.nunesd66.contatos.xml*",
	        "com.nunesd66.contato.*",
	        "com.nunesd66.email.*"
	    });
	    // 3) Também libera List e ArrayList para que a coleção possa ser instanciada
	    xstream.allowTypes(new Class[]{
	        java.util.List.class,
	        java.util.ArrayList.class
	    });
		
	    xstream.alias("contatos", List.class);
	    xstream.alias("contato", Contato.class);
	    
	    URL arquivo = this.getClass().getResource("/contatos.xml");
	    return (List<Contato>) xstream.fromXML(arquivo);
	}
	
}
