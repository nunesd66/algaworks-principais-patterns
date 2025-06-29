package calculadoraimpostos.com.nunesd66;

import calculadoraimpostos.com.nunesd66.log.xml.LoggerXml;

public class Teste {

	public static void main(String[] args) {
		CalculadoraDeImpostos calc = new CalculadoraDeImpostos(new LoggerXml());
		calc.calcular(10);
	}

}
