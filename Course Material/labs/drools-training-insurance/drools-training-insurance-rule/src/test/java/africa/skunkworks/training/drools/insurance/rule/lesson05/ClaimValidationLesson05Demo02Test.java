package africa.skunkworks.training.drools.insurance.rule.lesson05;

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

public class ClaimValidationLesson05Demo02Test extends AbstractRuleTest {


    @Autowired
    @Qualifier("claimValidationLesson05Demo02")
    private ClaimValidation claimValidation;

    @Test
    public void validateClaim(){
        //"Valid Claims"
        ClaimDto claimDto = getClaim("John Smith","P-101", LocalDate.now(),12399D);
        claimDto.setStatus(Status.PENDING);

        claimValidation.validateClaim(claimDto, null, "valid-claims");
        assertNotNull(claimDto.getStatus());
        assertNotNull(claimDto.getReason());


        System.out.println("++++++++++++++++++++++++++++++++++++++++ SCENARIO 1 ++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(claimDto.getReason());
    }

    @Test
    public void validateClaimInvalidPolicy(){
        //rule "Issue Payout"
        ClaimDto claimDto = getClaim("John Smith","P-101", LocalDate.now(),12399D);
        claimDto.setStatus(Status.APPROVED);

        PolicyDto policyDto = getPolicy("P-102","John Smith",130,130000,"Paid");

        claimValidation.validateClaim(claimDto, policyDto,"invalid-policy");
        assertNotNull(claimDto.getStatus());
        assertNotNull(claimDto.getReason());

        System.out.println("++++++++++++++++++++++++++++++++++++++++ SCENARIO 2 ++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(claimDto.getReason());
    }

    @Test
    public void validateClaimExceedCoverage(){
        //rule "Invalidate claim that exceeds coverage"
        ClaimDto claimDto = getClaim("John Smith","P-101", LocalDate.now(),1239900000D);
        claimDto.setStatus(Status.VALID);

        PolicyDto policyDto = getPolicy("P-101","John Smith",130,1300,"Paid");

        claimValidation.validateClaim(claimDto, policyDto,"exceed-coverage");
        assertNotNull(claimDto.getStatus());
        assertNotNull(claimDto.getReason());

        System.out.println("++++++++++++++++++++++++++++++++++++++++ SCENARIO 3 ++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(claimDto.getReason());
    }

    @Test
    public void validateClaimWithUnpaidPremium(){
        //rule "Invalidate claim with unpaid premiums"
        ClaimDto claimDto = getClaim("John Smith","P-101", LocalDate.now(),123D);
        claimDto.setStatus(Status.VALID);

        PolicyDto policyDto = getPolicy("P-101","John Smith",130,1300000,"Unpaid");

        claimValidation.validateClaim(claimDto, policyDto,"unpaid-premiums");
        assertNotNull(claimDto.getStatus());
        assertNotNull(claimDto.getReason());

        System.out.println("++++++++++++++++++++++++++++++++++++++++ SCENARIO 4 ++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(claimDto.getReason());

    }
}
