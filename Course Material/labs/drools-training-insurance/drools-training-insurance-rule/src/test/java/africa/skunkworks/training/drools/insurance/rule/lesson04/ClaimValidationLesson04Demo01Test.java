package africa.skunkworks.training.drools.insurance.rule.lesson04;

import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;
import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;
import africa.skunkworks.training.drools.insurance.domain.enums.Status;
import africa.skunkworks.training.drools.insurance.rule.AbstractRuleTest;
import africa.skunkworks.training.drools.insurance.rule.ClaimValidation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ClaimValidationLesson04Demo01Test extends AbstractRuleTest {

    @Autowired
    @Qualifier("claimValidationLesson04Demo01")
    private ClaimValidation claimValidation;

    @Test
    public void validateClaim(){
        ClaimDto claimDto = getClaim("John Smith","P-101", LocalDate.now(),12399D);
        claimDto.setStatus(Status.PENDING);

        PolicyDto policyDto = getPolicy("P-102","John Smith",130,130000,"Paid");

        claimValidation.validateClaim(claimDto, policyDto);
        assertNotNull(claimDto.getStatus());
        assertNotNull(claimDto.getReason());
        assertEquals(Status.APPROVED, claimDto.getStatus());

        System.out.println("++++++++++++++++++++++++++++++++++++++++ SCENARIO 1 ++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(claimDto.getReason());
    }

    @Test
    public void validateClaimPayoutIssue(){
        ClaimDto claimDto = getClaim("John Smith","P-101", LocalDate.now(),12399D);
        claimDto.setStatus(Status.APPROVED);

        PolicyDto policyDto = getPolicy("P-102","John Smith",130,130000,"Paid");

        claimValidation.validateClaim(claimDto, policyDto);
        assertNotNull(claimDto.getStatus());
        assertNotNull(claimDto.getReason());

        System.out.println("++++++++++++++++++++++++++++++++++++++++ SCENARIO 2 ++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(claimDto.getReason());

    }

    @Test
    public void validateClaimExceedCoverage(){
        ClaimDto claimDto = getClaim("John Smith","P-101", LocalDate.now(),123990000D);
        claimDto.setStatus(Status.VALID);

        PolicyDto policyDto = getPolicy("P-102","John Smith",130,130000,"Paid");

        claimValidation.validateClaim(claimDto, policyDto);
        assertNotNull(claimDto.getStatus());
        assertNotNull(claimDto.getReason());
        assertEquals(Status.DENIED, claimDto.getStatus());

        System.out.println("++++++++++++++++++++++++++++++++++++++++ SCENARIO 1 ++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(claimDto.getReason());
    }
}
