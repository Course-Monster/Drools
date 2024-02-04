package africa.skunkworks.training.drools.insurance.manager.rule.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.enums.ResponseCodeEnum;
import africa.skunkworks.training.drools.insurance.domain.web.response.Response;
import africa.skunkworks.training.drools.insurance.manager.AbstractMessageSourceManager;
import africa.skunkworks.training.drools.insurance.manager.rule.ApplicationRuleManager;
import africa.skunkworks.training.drools.insurance.service.repository.ApplicationService;
import africa.skunkworks.training.drools.insurance.service.rule.ApplicationRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ApplicationRuleManagerImpl extends AbstractMessageSourceManager implements ApplicationRuleManager {

    private final ApplicationService applicationService;


    private final ApplicationRuleService applicationRuleService;



    @Autowired
    public ApplicationRuleManagerImpl(MessageSource messageSource, ApplicationService applicationService, ApplicationRuleService applicationRuleService) {
        super(messageSource);
        this.applicationService = applicationService;
        this.applicationRuleService = applicationRuleService;
    }

    @Override
    public Response<List<ApplicationDto>> fireApplicationRules() {
        Response<List<ApplicationDto>> response = null;

        try{
            //List<ApplicationDto> applications =


        }catch (Exception ex){
            String message = getMessage("application.list.error", new String[]{ex.getMessage()});
            response = new Response<>(Boolean.FALSE,message, new ArrayList<>());
        }

        return response;
    }
}
