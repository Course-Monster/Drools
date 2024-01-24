package africa.skunkworks.training.drools.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class SkunkworksDroolsTrainingConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkunkworksDroolsTrainingConfigServerApplication.class, args);
	}

}
