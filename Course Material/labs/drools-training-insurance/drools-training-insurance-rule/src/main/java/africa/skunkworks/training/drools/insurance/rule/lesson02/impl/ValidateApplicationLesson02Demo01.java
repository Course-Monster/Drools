package africa.skunkworks.training.drools.insurance.rule.lesson02.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.response.ApplicationResponse;
import africa.skunkworks.training.drools.insurance.rule.AbstractValidateApplication;
import africa.skunkworks.training.drools.insurance.rule.ValidateApplication;
import org.kie.api.runtime.KieContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("validateApplicationLesson02Demo01")
public class ValidateApplicationLesson02Demo01 extends AbstractValidateApplication implements ValidateApplication {

    @Autowired
    public ValidateApplicationLesson02Demo01(@Qualifier("kieContainerLesson02demo01") KieContainer kieContainer) {
        super(kieContainer);
    }

    @Override
    public ApplicationResponse validateApplication(ApplicationDto applicationDto) {
        return super.validateApplication(applicationDto);
    }
}
