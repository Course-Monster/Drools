package africa.skunkworks.training.drools.insurance.service.rule.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;
import africa.skunkworks.training.drools.insurance.rule.policy.PolicyValidationRule;
import africa.skunkworks.training.drools.insurance.service.rule.PolicyRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyRuleServiceImpl implements PolicyRuleService {

    private final PolicyValidationRule policyValidationRule;

    @Autowired
    public PolicyRuleServiceImpl(PolicyValidationRule policyValidationRule) {
        this.policyValidationRule = policyValidationRule;
    }

    @Override
    public void validatePolicy(PolicyDto policyDto) {
        policyValidationRule.validatePolicy(policyDto);
    }
}
