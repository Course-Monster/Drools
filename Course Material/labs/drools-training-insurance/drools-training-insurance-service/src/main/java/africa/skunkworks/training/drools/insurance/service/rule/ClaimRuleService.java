package africa.skunkworks.training.drools.insurance.service.rule;

import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;

public interface ClaimRuleService {

    void validateClaim(ClaimDto claimDto, String agendaGroup);
}
