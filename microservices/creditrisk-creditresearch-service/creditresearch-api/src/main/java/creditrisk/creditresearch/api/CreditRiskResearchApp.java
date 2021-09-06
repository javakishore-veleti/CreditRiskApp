package creditrisk.creditresearch.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreditRiskResearchApp {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(CreditRiskResearchApp.class);
		app.run(args);

	}
}
