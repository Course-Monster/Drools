package africa.skunkworks.training.drools.insurance.repository;

import africa.skunkworks.training.drools.insurance.domain.repository.Policy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PolicyRepositoryTest extends AbstractRepositoryTest{

    @Autowired
    private PolicyRepository policyRepository;

    @Test
    public void listAllPolicies(){
        List<Policy> policies = policyRepository.findAll();
        assertNotNull(policies);
        assertFalse(policies.isEmpty());
        assertEquals(10, policies.size());

        Policy policy = policies.get(0);
        assertNotNull(policy);
        assertEquals("P-100", policy.getPolicyNumber());
        assertEquals("N/A", policy.getReason());
    }
}
