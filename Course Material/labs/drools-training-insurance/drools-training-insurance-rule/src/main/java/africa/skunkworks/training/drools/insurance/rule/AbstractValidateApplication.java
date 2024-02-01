package africa.skunkworks.training.drools.insurance.rule;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;
import africa.skunkworks.training.drools.insurance.domain.dto.ClientIdentificationDto;
import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;
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

    protected ApplicationResponse validateApplication(ApplicationDto applicationDto, ClientIdentificationDto clientIdentificationDto){
        ApplicationResponse applicationResponse = new ApplicationResponse();
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("applicationResponse", applicationResponse);
        kieSession.insert(applicationDto);
        kieSession.insert(clientIdentificationDto);
        kieSession.fireAllRules();
        kieSession.dispose();

        return applicationResponse;

    }

    protected void validateClaim(ClaimDto claimDto, PolicyDto policyDto){
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(claimDto);
        kieSession.insert(policyDto);
        kieSession.fireAllRules();
        kieSession.dispose();
    }
}
