package africa.skunkworks.training.drools.insurance.service.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;
import africa.skunkworks.training.drools.insurance.domain.enums.Status;
import africa.skunkworks.training.drools.insurance.service.ClaimValidationService;
import africa.skunkworks.training.drools.insurance.service.repository.ClaimRepositoryService;
import africa.skunkworks.training.drools.insurance.service.rule.ClaimRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClaimValidationServiceImpl implements ClaimValidationService {

    private final ClaimRuleService claimRuleService;

    private final ClaimRepositoryService claimRepositoryService;

    @Autowired
    public ClaimValidationServiceImpl(ClaimRuleService claimRuleService, ClaimRepositoryService claimRepositoryService) {
        this.claimRuleService = claimRuleService;
        this.claimRepositoryService = claimRepositoryService;
    }

    @Override
    public List<ClaimDto> validateAllClaims() {
        List<ClaimDto> claimDtos = new ArrayList<>();

        claimRepositoryService.listAllClaims().forEach(claim ->{
            if(Status.PENDING == claim.getStatus()){
                claimRuleService.validateClaim(claim, "valid-claim");
            }

            if(Status.APPROVED == claim.getStatus()){
                claimRuleService.validateClaim(claim, "issue-payout");
            }

            claimDtos.add(claim);
        });
        return claimDtos;
    }
}
