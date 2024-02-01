package africa.skunkworks.training.drools.insurance.rule;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;
import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;
import africa.skunkworks.training.drools.insurance.rule.config.RuleConfig;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest(classes = {RuleConfig.class})
public abstract class AbstractRuleTest {
    protected ApplicationDto getApplication(Integer clientAge, Boolean pec, Boolean isEmployed){
        return ApplicationDto.builder()
                .clientAge(clientAge)
                .pec(pec)
                .isEmployed(isEmployed)
                .build();
    }

    protected ClaimDto getClaim(String clientName, String policyNumber, LocalDate dateOfClaim, Double claimAmount){
        return ClaimDto.builder()
                .clientName(clientName)
                .policyNumber(policyNumber)
                .dateOfClaim(dateOfClaim)
                .claimAmount(claimAmount)
                .build();

    }

    protected PolicyDto getPolicy(String policyNumber, String clientName, Integer premium,Integer coverage, String paymentStatus ){
        return PolicyDto.builder()
                .clientName(clientName)
                .policyNumber(policyNumber)
                .premium(premium)
                .coverage(coverage)
                .paymentStatus(paymentStatus)
                .build();
    }
}
