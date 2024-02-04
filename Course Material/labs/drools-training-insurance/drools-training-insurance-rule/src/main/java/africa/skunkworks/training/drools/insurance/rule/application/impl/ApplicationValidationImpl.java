package africa.skunkworks.training.drools.insurance.rule.application.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.rule.application.ApplicationValidation;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ApplicationValidationImpl implements ApplicationValidation {

    private final KieContainer kieContainer;

    @Autowired
    public ApplicationValidationImpl(@Qualifier("applicationKieContainer") KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    @Override
    public void validateApplication(ApplicationDto applicationDto, String agendaGroup) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(applicationDto);
        kieSession.getAgenda().getAgendaGroup(agendaGroup).setFocus();
        kieSession.fireAllRules();
        kieSession.dispose();
    }
}
