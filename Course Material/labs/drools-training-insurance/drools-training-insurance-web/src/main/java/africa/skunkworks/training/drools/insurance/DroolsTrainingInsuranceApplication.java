package africa.skunkworks.training.drools.insurance;

import africa.skunkworks.training.drools.insurance.manager.config.ManagerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import({ManagerConfig.class})
@SpringBootApplication(scanBasePackages ={"africa.skunkworks.training.drools.insurance.web"} )
public class DroolsTrainingInsuranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DroolsTrainingInsuranceApplication.class, args);
	}

}
