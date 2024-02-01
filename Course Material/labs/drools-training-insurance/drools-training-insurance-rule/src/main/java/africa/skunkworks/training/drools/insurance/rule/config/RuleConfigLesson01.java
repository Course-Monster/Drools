package africa.skunkworks.training.drools.insurance.rule.config;

import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RuleConfigLesson01 extends AbstractRuleConfig{
    private static final String DROOL_FILE_DEMO_01 = "africa/skunkworks/training/drools/insurance/lesson01/demo01/application_validation_demo_01.drl";

    private static final String DROOL_FILE_DEMO_02 = "africa/skunkworks/training/drools/insurance/lesson01/demo02/application_validation_demo_02.drl";

    private static final String DROOL_FILE_DEMO_03 = "africa/skunkworks/training/drools/insurance/lesson01/demo03/application_validation_demo_03.drl";

    private static final String DROOL_FILE_DEMO_04 = "africa/skunkworks/training/drools/insurance/lesson01/demo04/application_validation_demo_04.drl";

    private static final String DROOL_FILE_DEMO_05 = "africa/skunkworks/training/drools/insurance/lesson01/demo05/application_validation_demo_05.drl";

    @Bean("kieContainerLesson01demo01")
    public KieContainer kieContainerDemo01(){
       return getKieContainer(DROOL_FILE_DEMO_01);
    }

    @Bean("kieContainerLesson01demo02")
    public KieContainer kieContainerDemo02(){
        return getKieContainer(DROOL_FILE_DEMO_02);

    }
    @Bean("kieContainerLesson01demo03")
    public KieContainer kieContainerDemo03(){
        return getKieContainer(DROOL_FILE_DEMO_03);
    }

    @Bean("kieContainerLesson01demo4")
    public KieContainer kieContainerDemo04(){
        return getKieContainer(DROOL_FILE_DEMO_04);
    }

    @Bean("kieContainerLesson01demo05")
    public KieContainer kieContainerDemo05(){
        return getKieContainer(DROOL_FILE_DEMO_05);
    }


}
