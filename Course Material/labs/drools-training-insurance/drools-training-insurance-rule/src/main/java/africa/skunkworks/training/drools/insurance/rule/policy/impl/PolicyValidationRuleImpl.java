package africa.skunkworks.training.drools.insurance.rule.policy.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;
import africa.skunkworks.training.drools.insurance.rule.policy.PolicyValidationRule;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PolicyValidationRuleImpl implements PolicyValidationRule {

    private final KieContainer kieContainer;

    @Autowired
    public PolicyValidationRuleImpl(@Qualifier("policyKieContainer") KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    @Override
    public void validatePolicy(PolicyDto policyDto) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(policyDto);
        kieSession.fireAllRules();
        kieSession.dispose();

    }
}
