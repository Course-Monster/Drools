package africa.skunkworks.training.drools.insurance.service.repository.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;
import africa.skunkworks.training.drools.insurance.repository.PolicyRepository;
import africa.skunkworks.training.drools.insurance.service.repository.PolicyRepositoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PolicyRepositoryServiceImpl implements PolicyRepositoryService {

    private final PolicyRepository policyRepository;

    public PolicyRepositoryServiceImpl(PolicyRepository policyRepository) {
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
                            .reason(policy.getReason())
                            .build()
            );
        });


        return policies;
    }
}
