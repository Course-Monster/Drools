package africa.skunkworks.training.drools.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;



@EnableEurekaServer
@SpringBootApplication
public class SkunkworksDroolsTrainingEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkunkworksDroolsTrainingEurekaApplication.class, args);
	}

}
