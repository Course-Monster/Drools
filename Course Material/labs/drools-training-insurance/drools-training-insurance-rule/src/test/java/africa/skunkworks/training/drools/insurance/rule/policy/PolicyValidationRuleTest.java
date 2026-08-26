package africa.skunkworks.training.drools.insurance.rule.policy;

import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;
import africa.skunkworks.training.drools.insurance.rule.AbstractRuleTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PolicyValidationRuleTest extends AbstractRuleTest {

    @Autowired
    private PolicyValidationRule policyValidationRule;

    @Test
    public void validatePolicy(){

        PolicyDto policyDto = getPolicy("P-101","Some Name",19191,200,"Unpaid");

        policyValidationRule.validatePolicy(policyDto);

        assertNotNull(policyDto);
        assertNotNull(policyDto.getReason());

    }
}
