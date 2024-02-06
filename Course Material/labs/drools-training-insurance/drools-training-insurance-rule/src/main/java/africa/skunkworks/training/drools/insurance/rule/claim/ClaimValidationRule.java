package africa.skunkworks.training.drools.insurance.rule.claim;

import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;

public interface ClaimValidationRule {

    void validateClaim(ClaimDto claimDto, String agendaGroup);
}
