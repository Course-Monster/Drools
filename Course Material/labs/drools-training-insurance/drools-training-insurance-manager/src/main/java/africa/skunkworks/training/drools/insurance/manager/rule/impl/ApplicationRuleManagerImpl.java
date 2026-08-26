package africa.skunkworks.training.drools.insurance.manager.rule.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.web.response.Response;
import africa.skunkworks.training.drools.insurance.manager.AbstractMessageSourceManager;
import africa.skunkworks.training.drools.insurance.manager.rule.ApplicationRuleManager;
import africa.skunkworks.training.drools.insurance.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ApplicationRuleManagerImpl extends AbstractMessageSourceManager implements ApplicationRuleManager {

    private final ApplicationService applicationService;

    @Autowired
    public ApplicationRuleManagerImpl(MessageSource messageSource, ApplicationService applicationService) {
        super(messageSource);
        this.applicationService = applicationService;
    }

    @Override
    public Response<List<ApplicationDto>> fireApplicationRules() {
        Response<List<ApplicationDto>> response;

        try{
            List<ApplicationDto> applications = applicationService.validateAllApplications();
            String message = getMessage("application.list.success");
            response = new Response<>(Boolean.TRUE,message,applications);

        }catch (Exception ex){
            String message = getMessage("application.list.error", new String[]{ex.getMessage()});
            response = new Response<>(Boolean.FALSE,message, new ArrayList<>());
        }

        return response;
    }
}
