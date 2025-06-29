package calculadoraimpostos.com.nunesd66.log.txt;

import calculadoraimpostos.com.nunesd66.configLog.ConfigLog;

public class ConfigLogTxt implements ConfigLog {

	@Override
	public void configurarLog(String msg) {
		System.out.println("ConfigLogTxt - configurando log de texto...");
		System.out.println(msg);
	}

}
