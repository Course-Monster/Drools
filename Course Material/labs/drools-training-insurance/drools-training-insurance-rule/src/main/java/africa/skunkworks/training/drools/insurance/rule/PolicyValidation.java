package africa.skunkworks.training.drools.insurance.rule;

import africa.skunkworks.training.drools.insurance.domain.dto.InvalidPolicy;
import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;

public interface PolicyValidation {

    void validatePolicy(PolicyDto policyDto, InvalidPolicy invalidPolicy);
}
