package africa.skunkworks.training.drools.insurance.rule.lesson04.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;
import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;
import africa.skunkworks.training.drools.insurance.rule.AbstractValidateApplication;
import africa.skunkworks.training.drools.insurance.rule.ClaimValidation;
import org.kie.api.runtime.KieContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("claimValidationLesson04Demo01")
public class ClaimValidationLesson04Demo01 extends AbstractValidateApplication implements ClaimValidation {

    @Autowired
    public ClaimValidationLesson04Demo01(@Qualifier("kieContainerLesson04demo01") KieContainer kieContainer) {
        super(kieContainer);
    }

    @Override
    public void validateClaim(ClaimDto claimDto, PolicyDto policyDto) {
        super.validateClaim(claimDto, policyDto);
    }
}
