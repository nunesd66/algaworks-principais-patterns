package calculadoraimpostos.com.nunesd66.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import calculadoraimpostos.com.nunesd66.configLog.ConfigLog;

public abstract class Logger {
	
	protected abstract ConfigLog criarConfigracaoLog();
	
	public void log(String message) {
		message = getDataHoraAtuais() + " - " + message;
		criarConfigracaoLog().configurarLog(message);
	};
	
	private String getDataHoraAtuais() {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", new Locale("pt", "BR"));
       
        return agora.format(formatter);
	}
}
