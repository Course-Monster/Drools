package africa.skunkworks.training.drools.insurance.service.config;

import africa.skunkworks.training.drools.insurance.repository.config.RepositoryConfig;
import africa.skunkworks.training.drools.insurance.rule.config.RuleConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({RepositoryConfig.class, RuleConfig.class})
@ComponentScan({"africa.skunkworks.training.drools.insurance.service"})
public class ServiceConfig {
}
