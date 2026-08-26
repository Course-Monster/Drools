package africa.skunkworks.training.drools.insurance.rule.lesson03;

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

public class ClaimValidationLesson02Demo01Test extends AbstractRuleTest {

    @Autowired
    @Qualifier("claimValidationLesson02Demo01")
    private ClaimValidation claimValidation;

    @Test
    public void validateClaim(){
        //Invalidate claim without matching policy
        ClaimDto claimDto = getClaim("John Smith","P-101", LocalDate.now(),12399D);

        PolicyDto policyDto = getPolicy("P-102","John Smith",130,130000,"Paid");

        claimValidation.validateClaim(claimDto,policyDto);
        assertNotNull(claimDto.getStatus());
        assertNotNull(claimDto.getReason());
        assertEquals(Status.DENIED, claimDto.getStatus());

        //Invalidate claim that exceeds coverage
        claimDto = getClaim("John Smith","P-101", LocalDate.now(),1239990D);

        policyDto = getPolicy("P-101","John Smith",130,130000,"UnPaid");

        claimValidation.validateClaim(claimDto,policyDto);
        assertNotNull(claimDto.getStatus());
        assertNotNull(claimDto.getReason());
        assertEquals(Status.DENIED, claimDto.getStatus());

        //Invalidate claim with unpaid premiums
        claimDto = getClaim("John Smith","P-101", LocalDate.now(),1239990D);

        policyDto = getPolicy("P-101","John Smith",13000000,130000,"UnPaid");

        claimValidation.validateClaim(claimDto,policyDto);
        assertNotNull(claimDto.getStatus());
        assertNotNull(claimDto.getReason());
        assertEquals(Status.DENIED, claimDto.getStatus());

        //Valid Claims
        claimDto = getClaim("John Smith","P-101", LocalDate.now(),1239D);
        claimDto.setStatus(Status.PENDING);

        policyDto = getPolicy("P-101","John Smith",1300000,130000,"Paid");

        claimValidation.validateClaim(claimDto,policyDto);
        assertNotNull(claimDto.getStatus());
        assertNotNull(claimDto.getReason());
        assertEquals(Status.APPROVED, claimDto.getStatus());

    }
}
