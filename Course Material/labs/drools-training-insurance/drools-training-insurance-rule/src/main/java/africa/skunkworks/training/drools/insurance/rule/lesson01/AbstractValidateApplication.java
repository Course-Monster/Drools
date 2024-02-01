package africa.skunkworks.training.drools.insurance.rule.lesson01;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.response.ApplicationResponse;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public abstract class AbstractValidateApplication {

    private final KieContainer kieContainer;

    public AbstractValidateApplication(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    protected ApplicationResponse validateApplication(ApplicationDto applicationDto) {
        ApplicationResponse applicationResponse = new ApplicationResponse();
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("applicationResponse", applicationResponse);
        kieSession.insert(applicationDto);
        kieSession.fireAllRules();
        kieSession.dispose();

        return applicationResponse;
    }
}
