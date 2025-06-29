import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.nunesd66.builder.NotaFiscalBuilder;
import com.nunesd66.entity.NotaFiscal;

public class NotaFiscalBuilderTest {

	@Test
	public void testBuilderNotaFiscal_OK() {
		NotaFiscal nf = new NotaFiscalBuilder()
				.buildNotaFiscalPessoaFisica()
				.numero("2345meia78")
				.dataEmissao("10/01/1995")
				.addItem("item1", 5, 1.0)
				.construir();
		
		assertNotNull(nf);
		assertNotNull(nf.getNumero());
		assertNotNull(nf.getDataEmissao());
		assertNotNull(nf.getItens());
	}
	
}
