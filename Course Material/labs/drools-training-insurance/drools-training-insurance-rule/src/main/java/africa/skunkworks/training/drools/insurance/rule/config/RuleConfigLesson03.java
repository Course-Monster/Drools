package africa.skunkworks.training.drools.insurance.rule.config;

import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RuleConfigLesson03 extends AbstractRuleConfig{

    private static final String DROOL_FILE_DEMO_01 = "africa/skunkworks/training/drools/insurance/lesson03/demo01/claim_validation_demo_01.drl";

    //private static final String DROOL_FILE_DEMO_02 = "africa/skunkworks/training/drools/insurance/lesson03/demo02/claim_validation_demo_02.drl";

    //private static final String DROOL_FILE_DEMO_03 = "africa/skunkworks/training/drools/insurance/lesson03/demo03/claim_validation_demo_03.drl";

    @Bean("kieContainerLesson03demo01")
    public KieContainer kieContainerDemo01(){
        return getKieContainer(DROOL_FILE_DEMO_01);
    }


}
