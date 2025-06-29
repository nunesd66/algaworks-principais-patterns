package com.nunesd66.leitorarquivo;

import java.net.URL;
import java.util.List;

import com.nunesd66.pedido.Pedido;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.NoTypePermission;

public class LeitorArquivoXML implements LeitorArquivo {


	@SuppressWarnings("unchecked")
	@Override
	public List<Pedido> getPedidos() {
		XStream xstream = new XStream();
		
	    // ** Segurança: bloqueia tudo por padrão **
	    xstream.addPermission(NoTypePermission.NONE);
	    // ** Libera apenas as classes do seu pacote de Contato **
	    xstream.allowTypesByWildcard(new String[]{
	        "com.nunesd66.leitorarquivo.*",
	        "com.nunesd66.pedido.*"
	    });
	    // 3) Também libera List e ArrayList para que a coleção possa ser instanciada
	    xstream.allowTypes(new Class[]{
	        java.util.List.class,
	        java.util.ArrayList.class
	    });
		
	    xstream.alias("pedidos", List.class);
	    xstream.alias("pedido", Pedido.class);
	    
	    URL arquivo = this.getClass().getResource("/produtos-vendidos.xml");
	    return (List<Pedido>) xstream.fromXML(arquivo);
	}

}
