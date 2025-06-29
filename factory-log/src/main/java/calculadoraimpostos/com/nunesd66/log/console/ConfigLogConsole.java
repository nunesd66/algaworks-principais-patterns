package calculadoraimpostos.com.nunesd66.log.console;

import calculadoraimpostos.com.nunesd66.configLog.ConfigLog;

public class ConfigLogConsole implements ConfigLog {

	@Override
	public void configurarLog(String msg) {
		System.out.println("ConfigLogConsole - configurando log de console...");
		System.out.println(msg);
	}

}
