package calculadoraimpostos.com.nunesd66.log.xml;

import calculadoraimpostos.com.nunesd66.configLog.ConfigLog;
import calculadoraimpostos.com.nunesd66.logger.Logger;

public class LoggerXml extends Logger {

	@Override
	protected ConfigLog criarConfigracaoLog() {
		return new ConfigLogXml();
	}

}
