package africa.skunkworks.training.drools.insurance.rule.config;

import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RuleConfigLesson03 extends AbstractRuleConfig{

    private static final String DROOL_FILE_DEMO_01 = "africa/skunkworks/training/drools/insurance/lesson03/demo01/claim_validation_demo_01.drl";

    private static final String DROOL_FILE_DEMO_02 = "africa/skunkworks/training/drools/insurance/lesson03/demo02/application_client_identification_validation_demo_02.drl";

    private static final String DROOL_FILE_DEMO_02_2 = "africa/skunkworks/training/drools/insurance/lesson03/demo02/validate_application_demo_02_2.drl";

    //private static final String DROOL_FILE_DEMO_03 = "africa/skunkworks/training/drools/insurance/lesson03/demo03/claim_validation_demo_03.drl";

    @Bean("kieContainerLesson03demo01")
    public KieContainer kieContainerDemo01(){
        return getKieContainer(DROOL_FILE_DEMO_01);
    }

    @Bean("kieContainerLesson03demo02")
    public KieContainer kieContainerDemo02(){
        return getKieContainer(DROOL_FILE_DEMO_02);
    }

    @Bean("kieContainerLesson03demo0202")
    public KieContainer kieContainerDemo0202(){
        return getKieContainer(DROOL_FILE_DEMO_02_2);
    }



}
