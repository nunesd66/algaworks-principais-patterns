package calculadoraimpostos.com.nunesd66.log.console;

import calculadoraimpostos.com.nunesd66.configLog.ConfigLog;
import calculadoraimpostos.com.nunesd66.logger.Logger;

public class LoggerConsole extends Logger {

	@Override
	protected ConfigLog criarConfigracaoLog() {
		return new ConfigLogConsole();
	}

}
