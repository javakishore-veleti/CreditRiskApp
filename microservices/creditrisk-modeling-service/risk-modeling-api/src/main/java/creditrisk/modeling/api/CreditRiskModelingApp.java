package creditrisk.modeling.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreditRiskModelingApp {
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(CreditRiskModelingApp.class);
		app.run(args);
	}
}
