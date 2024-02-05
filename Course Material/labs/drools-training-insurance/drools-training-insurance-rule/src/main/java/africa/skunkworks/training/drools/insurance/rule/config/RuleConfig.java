package africa.skunkworks.training.drools.insurance.rule.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"africa.skunkworks.training.drools.insurance.rule"})
@Import({RuleConfigLesson01.class, RuleConfigLesson02.class, RuleConfigLesson03.class, RuleConfigLesson04.class, RuleConfigApplication.class})
public class RuleConfig {
}
