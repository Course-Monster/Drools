package africa.skunkworks.training.drools.insurance.manager.rule.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;
import africa.skunkworks.training.drools.insurance.domain.web.response.Response;
import africa.skunkworks.training.drools.insurance.manager.AbstractMessageSourceManager;
import africa.skunkworks.training.drools.insurance.manager.rule.ClaimRuleManager;
import africa.skunkworks.training.drools.insurance.service.ClaimValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClaimRuleManagerImpl extends AbstractMessageSourceManager implements ClaimRuleManager {

    private final ClaimValidationService claimValidationService;

    @Autowired
    public ClaimRuleManagerImpl(MessageSource messageSource, ClaimValidationService claimValidationService) {
        super(messageSource);
        this.claimValidationService = claimValidationService;
    }

    @Override
    public Response<List<ClaimDto>> fireClaimRules() {
        Response<List<ClaimDto>> response;

        try{

            List<ClaimDto> claims = claimValidationService.validateAllClaims();
            String message = getMessage("claim.list.success");
            response = new Response<>(Boolean.TRUE,message, claims);

        }catch (Exception ex){
            String message = getMessage("claim.list.error", new String[]{ex.getMessage()});
            response = new Response<>(Boolean.FALSE,message, new ArrayList<>());
        }
        return response;
    }
}
