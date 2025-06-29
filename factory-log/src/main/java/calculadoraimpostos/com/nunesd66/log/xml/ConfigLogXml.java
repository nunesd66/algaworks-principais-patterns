package calculadoraimpostos.com.nunesd66.log.xml;

import calculadoraimpostos.com.nunesd66.configLog.ConfigLog;

public class ConfigLogXml implements ConfigLog {

	@Override
	public void configurarLog(String msg) {
		System.out.println("ConfigLogXml - configurando log de xml...");
		System.out.println(msg);
	}
}
