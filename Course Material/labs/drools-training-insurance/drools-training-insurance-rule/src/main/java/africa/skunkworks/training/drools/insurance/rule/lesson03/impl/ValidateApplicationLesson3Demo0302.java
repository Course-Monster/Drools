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

@Component("validateApplicationLesson3Demo0302")
public class ValidateApplicationLesson3Demo0302 extends AbstractValidateApplication implements ValidateApplication {
    @Autowired
    public ValidateApplicationLesson3Demo0302(@Qualifier("kieContainerLesson03demo0302") KieContainer kieContainer) {
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
