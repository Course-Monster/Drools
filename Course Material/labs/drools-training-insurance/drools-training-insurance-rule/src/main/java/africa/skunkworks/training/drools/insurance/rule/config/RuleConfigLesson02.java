package africa.skunkworks.training.drools.insurance.rule.config;

import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RuleConfigLesson02 extends AbstractRuleConfig{

    private static final String DROOL_FILE_DEMO_01 = "africa/skunkworks/training/drools/insurance/lesson02/demo01/application_validation_demo_01.drl";

    private static final String DROOL_FILE_DEMO_02 = "africa/skunkworks/training/drools/insurance/lesson02/demo02/application_validation_demo_02.drl";

    @Bean("kieContainerLesson02demo01")
    public KieContainer kieContainerDemo01(){
        return getKieContainer(DROOL_FILE_DEMO_01);
    }

    @Bean("kieContainerLesson02demo02")
    public KieContainer kieContainerDemo02(){
        return getKieContainer(DROOL_FILE_DEMO_02);

    }
}
