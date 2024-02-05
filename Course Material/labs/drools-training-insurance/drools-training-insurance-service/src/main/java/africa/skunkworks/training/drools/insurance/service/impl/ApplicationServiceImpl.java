package africa.skunkworks.training.drools.insurance.service.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.enums.Status;
import africa.skunkworks.training.drools.insurance.service.ApplicationService;
import africa.skunkworks.training.drools.insurance.service.repository.ApplicationRepositoryService;
import africa.skunkworks.training.drools.insurance.service.rule.ApplicationRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    private final ApplicationRepositoryService applicationService;


    private final ApplicationRuleService applicationRuleService;

    @Autowired
    public ApplicationServiceImpl(ApplicationRepositoryService applicationService, ApplicationRuleService applicationRuleService) {
        this.applicationService = applicationService;
        this.applicationRuleService = applicationRuleService;
    }


    @Override
    public List<ApplicationDto> validateAllApplications() {
        List<ApplicationDto> applications = new ArrayList<>();

        applicationService.listAllApplications().forEach(application ->{
            if(application.getIsEmployed()){
                applicationRuleService.validateApplication(application,"not-employed");

            }

            if(application.getClientAge() < 18){
                applicationRuleService.validateApplication(application,"application-minor");
            }

            if(application.getPec()){
                applicationRuleService.validateApplication(application,"application-pec");
            }

            if(Status.PENDING == application.getStatus()){
                applicationRuleService.validateApplication(application,"valid-application");
            }

            applications.add(application);

        });
        return applications;
    }
}
