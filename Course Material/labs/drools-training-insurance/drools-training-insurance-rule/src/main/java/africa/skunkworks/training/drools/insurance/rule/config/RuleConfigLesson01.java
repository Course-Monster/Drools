package africa.skunkworks.training.drools.insurance.rule.config;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"africa.skunkworks.training.drools.insurance.rule"})
public class RuleConfigLesson01 {
    private static final String DROOL_FILE_DEMO_01 = "africa/skunkworks/training/drools/insurance/lesson01/demo01/application_validation_demo_01.drl";

    private static final String DROOL_FILE_DEMO_02 = "africa/skunkworks/training/drools/insurance/lesson01/demo02/application_validation_demo_02.drl";

    @Bean("kieContainerLesson01demo01")
    public KieContainer kieContainerDemo01(){
       return getKieContainer(DROOL_FILE_DEMO_01);
    }

    @Bean("kieContainerLesson01demo02")
    public KieContainer kieContainerDemo02(){
        return getKieContainer(DROOL_FILE_DEMO_02);

    }

    private KieContainer getKieContainer(String droolFile){

        KieServices kieServices = KieServices.Factory.get();

        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        kieFileSystem.write(ResourceFactory.newClassPathResource(droolFile));
        KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem);
        kieBuilder.buildAll();
        KieModule kieModule = kieBuilder.getKieModule();

        return kieServices.newKieContainer(kieModule.getReleaseId());

    }
}
