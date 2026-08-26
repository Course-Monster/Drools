package africa.skunkworks.training.drools.insurance.rule.lesson03.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.dto.ClientIdentificationDto;
import africa.skunkworks.training.drools.insurance.domain.response.ApplicationResponse;
import africa.skunkworks.training.drools.insurance.rule.AbstractValidateApplication;
import africa.skunkworks.training.drools.insurance.rule.ValidateApplication;
import org.kie.api.runtime.KieContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("validateApplicationAndClientIdentificationLesson03Demo03")
public class ValidateApplicationAndClientIdentificationLesson03Demo03 extends AbstractValidateApplication implements ValidateApplication {
    @Autowired
    public ValidateApplicationAndClientIdentificationLesson03Demo03(@Qualifier("kieContainerLesson03demo03") KieContainer kieContainer) {
        super(kieContainer);
    }

    @Override
    public ApplicationResponse validateApplication(ApplicationDto applicationDto) {
        return null;
    }

    @Override
    public ApplicationResponse validateApplication(ApplicationDto applicationDto, ClientIdentificationDto clientIdentificationDto) {
        return super.validateApplication(applicationDto,clientIdentificationDto);
    }
}
