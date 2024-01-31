package africa.skunkworks.training.drools.insurance.rule.lesson01.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.response.ApplicationResponse;
import africa.skunkworks.training.drools.insurance.rule.lesson01.ValidateApplication;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("validateApplicationLesson01Demo02")
public class ValidateApplicationLesson01Demo02 implements ValidateApplication {

    private final KieContainer kieContainer;

    @Autowired
    public ValidateApplicationLesson01Demo02(@Qualifier("kieContainerLesson01demo02") KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    @Override
    public ApplicationResponse validateApplication(ApplicationDto applicationDto) {
        ApplicationResponse applicationResponse = new ApplicationResponse();
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("applicationResponse", applicationResponse);
        kieSession.insert(applicationDto);
        kieSession.fireAllRules();
        kieSession.dispose();

        return applicationResponse;
    }
}
