package africa.skunkworks.training.drools.insurance.rule.claim;

import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;
import africa.skunkworks.training.drools.insurance.domain.enums.Status;
import africa.skunkworks.training.drools.insurance.rule.AbstractRuleTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ClaimValidationRuleTest extends AbstractRuleTest {

    @Autowired
    private ClaimValidationRule claimValidationRule;

    @Test
    public void validateClaim(){
        ClaimDto claim = getClaim("Chuck Norry", "P-100", LocalDate.now(),19283D);
        claim.setStatus(Status.PENDING);

        claimValidationRule.validateClaim(claim,"valid-claim");
        assertNotNull(claim);
        assertNotNull(claim.getReason());
        assertEquals(Status.APPROVED, claim.getStatus());
    }

    @Test
    public void validateClaimIssuePayout(){
        ClaimDto claim = getClaim("Chuck Norry", "P-100", LocalDate.now(),19283D);
        claim.setStatus(Status.APPROVED);

        claimValidationRule.validateClaim(claim,"issue-payout");
        assertNotNull(claim);
        assertNotNull(claim.getReason());
        assertEquals(Status.APPROVED, claim.getStatus());

    }
}
