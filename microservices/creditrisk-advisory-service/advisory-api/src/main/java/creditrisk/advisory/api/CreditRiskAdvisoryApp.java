package creditrisk.advisory.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreditRiskAdvisoryApp {
	
	public static void main(String[] args) {
		
		SpringApplication app = new SpringApplication(CreditRiskAdvisoryApp.class);
		app.run(args);
	}
}
