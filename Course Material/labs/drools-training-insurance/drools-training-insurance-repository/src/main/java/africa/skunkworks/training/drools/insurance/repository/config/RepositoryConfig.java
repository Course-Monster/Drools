package africa.skunkworks.training.drools.insurance.repository.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@EntityScan(basePackages = {"africa.skunkworks.training.drools.insurance.domain.repository"})
@EnableJpaRepositories( basePackages = {"africa.skunkworks.training.drools.insurance.repository"})
public class RepositoryConfig {
}
