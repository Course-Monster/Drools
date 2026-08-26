package africa.skunkworks.training.drools.insurance.rule.policy;

import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;

public interface PolicyValidationRule {

    void validatePolicy(PolicyDto policyDto);
}
