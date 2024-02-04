package africa.skunkworks.training.drools.insurance.rule.config;

import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RuleConfigLesson05 extends AbstractRuleConfig {

    private static final String DROOL_FILE_DEMO_01 = "africa/skunkworks/training/drools/insurance/lesson05/demo01/claim_validation_demo_01.drl";

    private static final String DROOL_FILE_DEMO_02 = "africa/skunkworks/training/drools/insurance/lesson05/demo02/claim_validation_demo_02.drl";

    private static final String DROOL_FILE_DEMO_02_2 = "africa/skunkworks/training/drools/insurance/lesson05/demo02/payout_issue_demo_02.drl";

    private static final String DROOL_FILE_DEMO_03 = "africa/skunkworks/training/drools/insurance/lesson05/demo03/claim_validation_demo_03.drl";

    private static final String DROOL_FILE_DEMO_03_2 = "africa/skunkworks/training/drools/insurance/lesson05/demo03/payout_issue_demo_03.drl";

    private static final String DROOL_FILE_DEMO_03_3 = "africa/skunkworks/training/drools/insurance/lesson05/demo03/policy_validation_demo_03.drl";

    private static final String DROOL_FILE_DEMO_04 = "africa/skunkworks/training/drools/insurance/lesson05/demo04/claim_validation_demo_04.drl";

    private static final String DROOL_FILE_DEMO_04_2 = "africa/skunkworks/training/drools/insurance/lesson05/demo04/payout_issue_demo_04.drl";

    private static final String DROOL_FILE_DEMO_04_3 = "africa/skunkworks/training/drools/insurance/lesson05/demo04/policy_validation_demo_04.drl";

    @Bean("kieContainerLesson05demo01")
    public KieContainer kieContainerDemo01(){return getKieContainer(DROOL_FILE_DEMO_01);}
    @Bean("kieContainerLesson05demo02")
    public KieContainer kieContainerDemo02(){return getKieContainer(DROOL_FILE_DEMO_02);}
    @Bean("kieContainerLesson05demo0202")
    public KieContainer kieContainerDemo0102(){return getKieContainer(DROOL_FILE_DEMO_02_2);}

    @Bean("kieContainerLesson05demo03")
    public KieContainer kieContainerDemo03(){return getKieContainer(DROOL_FILE_DEMO_03);}

    @Bean("kieContainerLesson05demo0302")
    public KieContainer kieContainerDemo0302(){return getKieContainer(DROOL_FILE_DEMO_03_2);}

    @Bean("kieContainerLesson05demo0303")
    public KieContainer kieContainerDemo0303(){return getKieContainer(DROOL_FILE_DEMO_03_3);}

    @Bean("kieContainerLesson05demo04")
    public KieContainer kieContainerDemo04(){return getKieContainer(DROOL_FILE_DEMO_04);}

    @Bean("kieContainerLesson05demo01")
    public KieContainer kieContainerDemo0402(){return getKieContainer(DROOL_FILE_DEMO_04_2);}

    @Bean("kieContainerLesson05demo01")
    public KieContainer kieContainerDemo0403(){return getKieContainer(DROOL_FILE_DEMO_04_3);}

}
