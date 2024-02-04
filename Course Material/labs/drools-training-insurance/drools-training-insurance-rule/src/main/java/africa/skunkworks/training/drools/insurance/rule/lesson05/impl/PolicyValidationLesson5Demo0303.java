package africa.skunkworks.training.drools.insurance.rule.lesson05.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.InvalidPolicy;
import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;
import africa.skunkworks.training.drools.insurance.rule.AbstractValidateApplication;
import africa.skunkworks.training.drools.insurance.rule.PolicyValidation;
import org.kie.api.runtime.KieContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("policyValidationLesson5Demo0303")
public class PolicyValidationLesson5Demo0303 extends AbstractValidateApplication implements PolicyValidation {

    @Autowired
    public PolicyValidationLesson5Demo0303(@Qualifier("kieContainerLesson05demo0303") KieContainer kieContainer) {
        super(kieContainer);
    }

    @Override
    public void validatePolicy(PolicyDto policyDto, InvalidPolicy invalidPolicy) {
        super.validatePolicy(policyDto, invalidPolicy);

    }
}
