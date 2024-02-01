package africa.skunkworks.training.drools.insurance.rule.config;

import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RuleConfigLesson04 extends AbstractRuleConfig{

    private static final String DROOL_FILE_DEMO_01 = "africa/skunkworks/training/drools/insurance/lesson04/demo01/claim_validation_demo_01.drl";

    private static final String DROOL_FILE_DEMO_02 = "africa/skunkworks/training/drools/insurance/lesson04/demo02/claim_validation_demo_02.drl";

    private static final String DROOL_FILE_DEMO_02_2 = "africa/skunkworks/training/drools/insurance/lesson04/demo02/payout_issue_demo_02.drl";

    private static final String DROOL_FILE_DEMO_03 = "africa/skunkworks/training/drools/insurance/lesson04/demo03/claim_validation_demo_03.drl";

    private static final String DROOL_FILE_DEMO_03_2 = "africa/skunkworks/training/drools/insurance/lesson04/demo03/payout_issue_demo_03.drl";

    private static final String DROOL_FILE_DEMO_04 = "africa/skunkworks/training/drools/insurance/lesson04/demo04/claim_validation_demo_04.drl";

    private static final String DROOL_FILE_DEMO_04_2 = "africa/skunkworks/training/drools/insurance/lesson04/demo04/payout_issue_demo_04.drl";

    private static final String DROOL_FILE_DEMO_05 = "africa/skunkworks/training/drools/insurance/lesson04/demo05/claim_validation_demo_05.drl";

    private static final String DROOL_FILE_DEMO_05_2 = "africa/skunkworks/training/drools/insurance/lesson04/demo05/payout_issue_demo_05.drl";

    @Bean("kieContainerLesson04demo01")
    public KieContainer kieContainerDemo01(){
        return getKieContainer(DROOL_FILE_DEMO_01);
    }

    @Bean("kieContainerLesson04demo02")
    public KieContainer kieContainerDemo02(){
        return getKieContainer(DROOL_FILE_DEMO_02);
    }

    @Bean("kieContainerLesson04demo0202")
    public KieContainer kieContainerDemo0202(){
        return getKieContainer(DROOL_FILE_DEMO_02_2);
    }

    @Bean("kieContainerLesson04demo03")
    public KieContainer kieContainerDemo03(){
        return getKieContainer(DROOL_FILE_DEMO_03);
    }

    @Bean("kieContainerLesson04demo0302")
    public KieContainer kieContainerDemo0302(){
        return getKieContainer(DROOL_FILE_DEMO_03_2);
    }

    @Bean("kieContainerLesson04demo04")
    public KieContainer kieContainerDemo04(){
        return getKieContainer(DROOL_FILE_DEMO_04);
    }

    @Bean("kieContainerLesson04demo0402")
    public KieContainer kieContainerDemo0402(){
        return getKieContainer(DROOL_FILE_DEMO_04_2);
    }

    @Bean("kieContainerLesson04demo05")
    public KieContainer kieContainerDemo05(){
        return getKieContainer(DROOL_FILE_DEMO_05);
    }

    @Bean("kieContainerLesson04demo0502")
    public KieContainer kieContainerDemo0502(){
        return getKieContainer(DROOL_FILE_DEMO_05_2);
    }






}
