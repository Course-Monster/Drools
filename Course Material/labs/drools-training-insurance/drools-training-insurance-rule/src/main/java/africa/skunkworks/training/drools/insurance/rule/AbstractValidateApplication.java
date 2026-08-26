package africa.skunkworks.training.drools.insurance.rule;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;
import africa.skunkworks.training.drools.insurance.domain.dto.ClientIdentificationDto;
import africa.skunkworks.training.drools.insurance.domain.dto.InvalidPolicy;
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

    protected void validatePolicy(PolicyDto policyDto, InvalidPolicy invalidPolicy){
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(policyDto);
        kieSession.insert(invalidPolicy);
        kieSession.fireAllRules();
        kieSession.dispose();
    }

    protected void validateClaim(ClaimDto claimDto){
        this.validateClaim(claimDto,null);
    }

    protected void validateClaim(ClaimDto claimDto, PolicyDto policyDto){
       this.validateClaim(claimDto, policyDto, null);
    }

    protected void validateClaim(ClaimDto claimDto, PolicyDto policyDto, String agendaGroup){
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(claimDto);
        if(null != policyDto){
            kieSession.insert(policyDto);
        }

        if(null != agendaGroup){
            kieSession.getAgenda().getAgendaGroup(agendaGroup).setFocus();
        }

        kieSession.fireAllRules();
        kieSession.dispose();
    }
}
