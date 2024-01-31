package africa.skunkworks.training.drools.insurance.rule.lesson01.demo01.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.rule.lesson01.demo01.ValidateApplication;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("validateApplicationLesson01Demo01")
public class ValidateApplicationLesson01Demo01 implements ValidateApplication {

    private final KieContainer kieContainer;

    @Autowired
    public ValidateApplicationLesson01Demo01(@Qualifier("kieContainerLesson01demo01") KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    @Override
    public void validateApplication(ApplicationDto applicationDto) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("application", applicationDto);
        kieSession.fireAllRules();
        kieSession.dispose();
    }
}
