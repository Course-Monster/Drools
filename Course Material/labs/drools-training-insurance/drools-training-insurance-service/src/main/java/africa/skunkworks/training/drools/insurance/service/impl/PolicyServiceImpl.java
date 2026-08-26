package africa.skunkworks.training.drools.insurance.service.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;
import africa.skunkworks.training.drools.insurance.service.PolicyService;
import africa.skunkworks.training.drools.insurance.service.repository.PolicyRepositoryService;
import africa.skunkworks.training.drools.insurance.service.rule.PolicyRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PolicyServiceImpl implements PolicyService {


    private final PolicyRepositoryService policyRepositoryService;

    private final PolicyRuleService policyRuleService;

    @Autowired
    public PolicyServiceImpl(PolicyRepositoryService policyRepositoryService, PolicyRuleService policyRuleService) {
        this.policyRepositoryService = policyRepositoryService;
        this.policyRuleService = policyRuleService;
    }

    @Override
    public List<PolicyDto> validateAllPolicies() {
        List<PolicyDto> policies = new ArrayList<>();

        policyRepositoryService.listAllPolicies().forEach(policy ->{
            policyRuleService.validatePolicy(policy);
            policies.add(policy);
        });

        return policies;
    }
}
