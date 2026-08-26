package africa.skunkworks.training.drools.insurance.rule.lesson04.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;
import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;
import africa.skunkworks.training.drools.insurance.rule.AbstractValidateApplication;
import africa.skunkworks.training.drools.insurance.rule.ClaimValidation;
import org.kie.api.runtime.KieContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("claimValidationLesson04Demo04")
public class ClaimValidationLesson04Demo04 extends AbstractValidateApplication implements ClaimValidation {

    @Autowired
    public ClaimValidationLesson04Demo04(@Qualifier("kieContainerLesson04demo04") KieContainer kieContainer) {
        super(kieContainer);
    }

    @Override
    public void validateClaim(ClaimDto claimDto) {
        super.validateClaim(claimDto);
    }

    @Override
    public void validateClaim(ClaimDto claimDto, PolicyDto policyDto) {
        super.validateClaim(claimDto, policyDto);

    }

    @Override
    public void validateClaim(ClaimDto claimDto, PolicyDto policyDto, String agendaGroup) {
        super.validateClaim(claimDto, policyDto, agendaGroup);
    }
}
