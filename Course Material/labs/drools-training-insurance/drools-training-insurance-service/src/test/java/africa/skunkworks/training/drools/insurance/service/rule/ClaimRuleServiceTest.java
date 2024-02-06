package africa.skunkworks.training.drools.insurance.service.rule;

import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;
import africa.skunkworks.training.drools.insurance.domain.enums.Status;
import africa.skunkworks.training.drools.insurance.rule.claim.ClaimValidationRule;
import africa.skunkworks.training.drools.insurance.service.AbstractServiceTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.time.LocalDate;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

public class ClaimRuleServiceTest extends AbstractServiceTest {

    @MockBean
    private ClaimValidationRule claimValidationRule;

    @Autowired
    private ClaimRuleService claimRuleService;

    @Test
    public void validateClaim(){
        ClaimDto claimDto = getClaim();

        doNothing().when(claimValidationRule).validateClaim(claimDto,"valid-claim");

        claimRuleService.validateClaim(claimDto, "valid-claim");

        verify(claimValidationRule).validateClaim(claimDto,"valid-claim");
    }

    private ClaimDto getClaim(){
        return ClaimDto.builder()
                .status(Status.PENDING)
                .claimAmount(29908D)
                .dateOfClaim(LocalDate.now())
                .policyNumber("P-109")
                .build();
    }
}
