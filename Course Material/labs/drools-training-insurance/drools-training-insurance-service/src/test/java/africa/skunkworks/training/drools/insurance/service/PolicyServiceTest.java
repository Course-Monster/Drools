package africa.skunkworks.training.drools.insurance.service;

import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PolicyServiceTest extends AbstractServiceTest{

    @Autowired
    private PolicyService policyService;

    @Test
    public void validateAllPolicies(){
        List<PolicyDto> policies = policyService.validateAllPolicies();
        assertNotNull(policies);
        assertFalse(policies.isEmpty());
        assertEquals(10, policies.size());
    }
}
