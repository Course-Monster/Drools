package africa.skunkworks.training.drools.insurance.rule.lesson01.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.dto.ClientIdentificationDto;
import africa.skunkworks.training.drools.insurance.domain.response.ApplicationResponse;
import africa.skunkworks.training.drools.insurance.rule.AbstractValidateApplication;
import africa.skunkworks.training.drools.insurance.rule.ValidateApplication;
import org.kie.api.runtime.KieContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("validateApplicationLesson01Demo05")
public class ValidateApplicationLesson01Demo05 extends AbstractValidateApplication implements ValidateApplication {
    @Autowired
    public ValidateApplicationLesson01Demo05(@Qualifier("kieContainerLesson01demo05") KieContainer kieContainer) {
        super(kieContainer);
    }

    @Override
    public ApplicationResponse validateApplication(ApplicationDto applicationDto) {
        return super.validateApplication(applicationDto);
    }

    @Override
    public ApplicationResponse validateApplication(ApplicationDto applicationDto, ClientIdentificationDto clientIdentificationDto) {
        return null;
    }
}
