package africa.skunkworks.training.drools.insurance.service.rule.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;
import africa.skunkworks.training.drools.insurance.rule.claim.ClaimValidationRule;
import africa.skunkworks.training.drools.insurance.service.rule.ClaimRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaimRuleServiceImpl implements ClaimRuleService {
    private final ClaimValidationRule claimValidationRule;

    @Autowired
    public ClaimRuleServiceImpl(ClaimValidationRule claimValidationRule) {
        this.claimValidationRule = claimValidationRule;
    }

    @Override
    public void validateClaim(ClaimDto claimDto, String agendaGroup) {
        claimValidationRule.validateClaim(claimDto, agendaGroup);

    }
}
