package africa.skunkworks.training.drools.insurance.rule;

import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;
import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;

public interface ClaimValidation {

    void validateClaim(ClaimDto claimDto, PolicyDto policyDto);
}
