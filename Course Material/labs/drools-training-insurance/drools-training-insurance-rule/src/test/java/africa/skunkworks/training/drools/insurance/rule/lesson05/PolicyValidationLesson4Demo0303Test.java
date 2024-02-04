package africa.skunkworks.training.drools.insurance.rule.lesson05;

import africa.skunkworks.training.drools.insurance.domain.dto.InvalidPolicy;
import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;
import africa.skunkworks.training.drools.insurance.rule.AbstractRuleTest;
import africa.skunkworks.training.drools.insurance.rule.PolicyValidation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PolicyValidationLesson4Demo0303Test extends AbstractRuleTest {

    @Autowired
    @Qualifier("policyValidationLesson5Demo0303")
    private PolicyValidation policyValidation;

    @Test
    public void validatePolicy(){

        PolicyDto policyDto = getPolicy("P-100","John Smith",199999,200000,"Unpaid");
        InvalidPolicy invalidPolicy = new InvalidPolicy(PolicyDto.builder().build());

        policyValidation.validatePolicy(policyDto,invalidPolicy);
        assertNotNull(policyDto.getReason());

        System.out.println("++++++++++++++++++++++++++++++++++++++++ SCENARIO 3 ++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(policyDto.getReason());

    }
}
