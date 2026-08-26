package africa.skunkworks.training.drools.insurance.service.rule;

import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;
import africa.skunkworks.training.drools.insurance.rule.policy.PolicyValidationRule;
import africa.skunkworks.training.drools.insurance.service.AbstractServiceTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

public class PolicyRuleServiceTest extends AbstractServiceTest {

    @MockBean
    private PolicyValidationRule policyValidationRule;

    @Autowired
    private PolicyRuleService policyRuleService;

    @Test
    public void validatePolicy(){
        PolicyDto policy = getPolicy();

        doNothing().when(policyValidationRule).validatePolicy(policy);

        policyRuleService.validatePolicy(policy);

        verify(policyValidationRule).validatePolicy(policy);
    }

    private PolicyDto getPolicy(){
        return PolicyDto.builder()
                .policyNumber("P-100")
                .paymentStatus("Unpaid")
                .coverage(19000)
                .premium(18000)
                .clientName("John Wayne")
                .build();
    }
}
