package africa.skunkworks.training.drools.insurance.manager.rule.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;
import africa.skunkworks.training.drools.insurance.domain.web.response.Response;
import africa.skunkworks.training.drools.insurance.manager.AbstractMessageSourceManager;
import africa.skunkworks.training.drools.insurance.manager.rule.PolicyRuleManager;
import africa.skunkworks.training.drools.insurance.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PolicyRuleManagerImpl extends AbstractMessageSourceManager implements PolicyRuleManager {

    private final PolicyService policyService;

    @Autowired
    public PolicyRuleManagerImpl(MessageSource messageSource,PolicyService policyService) {
        super(messageSource);
        this.policyService = policyService;
    }

    @Override
    public Response<List<PolicyDto>> fireAllRulePolicies() {
        Response<List<PolicyDto>> response;

        try{

            List<PolicyDto> policies = policyService.validateAllPolicies();
            String message = getMessage("policy.list.success");
            response = new Response<>(Boolean.TRUE,message, policies);

        }catch (Exception ex){
            String message = getMessage("policy.list.error", new String[]{ex.getMessage()});
            response = new Response<>(Boolean.FALSE,message, new ArrayList<>());
        }

        return response;
    }
}
