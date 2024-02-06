package africa.skunkworks.training.drools.insurance.manager.rule;

import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;
import africa.skunkworks.training.drools.insurance.domain.web.response.Response;

import java.util.List;

public interface ClaimRuleManager {

    Response<List<ClaimDto>> fireClaimRules();
}
