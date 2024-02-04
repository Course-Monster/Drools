package africa.skunkworks.training.drools.insurance.rule.lesson05.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;
import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;
import africa.skunkworks.training.drools.insurance.rule.AbstractValidateApplication;
import africa.skunkworks.training.drools.insurance.rule.ClaimValidation;
import org.kie.api.runtime.KieContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("claimValidationLesson05Demo03")
public class ClaimValidationLesson05Demo03 extends AbstractValidateApplication implements ClaimValidation {

    @Autowired
    public ClaimValidationLesson05Demo03(@Qualifier("kieContainerLesson05demo03") KieContainer kieContainer) {
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
        super.validateClaim(claimDto,policyDto,agendaGroup);

    }
}
