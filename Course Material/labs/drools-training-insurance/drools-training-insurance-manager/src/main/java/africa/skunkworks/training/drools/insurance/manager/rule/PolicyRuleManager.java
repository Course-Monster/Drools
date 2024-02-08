package africa.skunkworks.training.drools.insurance.manager.rule;

import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;
import africa.skunkworks.training.drools.insurance.domain.web.response.Response;

import java.util.List;

public interface PolicyRuleManager {

    Response<List<PolicyDto>> fireAllRulePolicies();
}
