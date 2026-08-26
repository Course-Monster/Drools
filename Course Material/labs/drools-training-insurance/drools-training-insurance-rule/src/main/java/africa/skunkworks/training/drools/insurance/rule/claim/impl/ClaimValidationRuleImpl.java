package africa.skunkworks.training.drools.insurance.rule.claim.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;
import africa.skunkworks.training.drools.insurance.rule.claim.ClaimValidationRule;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClaimValidationRuleImpl implements ClaimValidationRule {

    private final KieContainer kieContainer;

    @Autowired
    public ClaimValidationRuleImpl(@Qualifier("claimKieContainer") KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    @Override
    public void validateClaim(ClaimDto claimDto, String agendaGroup) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(claimDto);
        kieSession.getAgenda().getAgendaGroup(agendaGroup).setFocus();
        kieSession.fireAllRules();
        kieSession.dispose();

    }
}
