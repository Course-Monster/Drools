package africa.skunkworks.training.drools.insurance.rule.lesson01.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.response.ApplicationResponse;
import africa.skunkworks.training.drools.insurance.rule.AbstractValidateApplication;
import africa.skunkworks.training.drools.insurance.rule.ValidateApplication;
import org.kie.api.runtime.KieContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("validateApplicationLesson01Demo04")
public class ValidateApplicationLesson01Demo04 extends AbstractValidateApplication implements ValidateApplication {

    @Autowired
    public ValidateApplicationLesson01Demo04(@Qualifier("kieContainerLesson01demo4") KieContainer kieContainer) {
        super(kieContainer);
    }

    @Override
    public ApplicationResponse validateApplication(ApplicationDto applicationDto) {
        return super.validateApplication(applicationDto);
    }
}
