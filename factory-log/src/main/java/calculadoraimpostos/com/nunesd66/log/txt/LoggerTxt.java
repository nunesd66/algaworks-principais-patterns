package calculadoraimpostos.com.nunesd66.log.txt;

import calculadoraimpostos.com.nunesd66.configLog.ConfigLog;
import calculadoraimpostos.com.nunesd66.logger.Logger;

public class LoggerTxt extends Logger {

	@Override
	protected ConfigLog criarConfigracaoLog() {
		return new ConfigLogTxt();
	}

}
