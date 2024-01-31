package africa.skunkworks.training.drools.insurance.service.repository.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;
import africa.skunkworks.training.drools.insurance.repository.PolicyRepository;
import africa.skunkworks.training.drools.insurance.service.repository.PolicyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PolicyServiceImpl implements PolicyService {

    private final PolicyRepository policyRepository;

    public PolicyServiceImpl(PolicyRepository policyRepository) {
        this.policyRepository = policyRepository;
    }

    @Override
    public List<PolicyDto> listAllPolicies() {
        List<PolicyDto> policies = new ArrayList<>();

        policyRepository.findAll().forEach(policy -> {
            policies.add(
                    PolicyDto.builder()
                            .policyNumber(policy.getPolicyNumber())
                            .clientName(policy.getClient().getClientName())
                            .paymentStatus(policy.getStatus())
                            .premium(policy.getPremium().intValue())
                            .coverage(policy.getCoverage().intValue())
                            .reason("N/A")
                            .build()
            );
        });


        return policies;
    }
}
