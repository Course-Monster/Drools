package africa.skunkworks.training.drools.insurance.service.repository;

import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;
import africa.skunkworks.training.drools.insurance.domain.repository.Policy;
import africa.skunkworks.training.drools.insurance.repository.PolicyRepository;
import africa.skunkworks.training.drools.insurance.service.AbstractServiceTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class PolicyServiceTest extends AbstractServiceTest {

    @MockBean
    private PolicyRepository policyRepository;

    @Autowired
    private PolicyRepositoryService policyService;

    @Test
    public void listAllPolicies(){
        when(policyRepository.findAll()).thenReturn(getPolicies());

        List<PolicyDto> policies = policyService.listAllPolicies();
        assertNotNull(policies);
        assertFalse(policies.isEmpty());
        assertEquals(2, policies.size());

        verify(policyRepository).findAll();
    }

    private List<Policy> getPolicies(){
        return List.of(getPolicy("P-101", BigDecimal.valueOf(1500),BigDecimal.valueOf(150000),"Paid"),
        getPolicy("P-102", BigDecimal.valueOf(200), BigDecimal.valueOf(20000),"Paid"));
    }


}
