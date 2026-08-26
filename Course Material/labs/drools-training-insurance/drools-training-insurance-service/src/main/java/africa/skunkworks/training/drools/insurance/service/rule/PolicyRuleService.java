package africa.skunkworks.training.drools.insurance.service.rule;

import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;

public interface PolicyRuleService {

    void validatePolicy(PolicyDto policyDto);


}
