package africa.skunkworks.training.drools.insurance.rule.lesson01.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.response.ApplicationResponse;
import africa.skunkworks.training.drools.insurance.rule.lesson01.AbstractValidateApplication;
import africa.skunkworks.training.drools.insurance.rule.lesson01.ValidateApplication;
import org.kie.api.runtime.KieContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("validateApplicationLesson01Demo02")
public class ValidateApplicationLesson01Demo02  extends AbstractValidateApplication implements ValidateApplication {

    @Autowired
    public ValidateApplicationLesson01Demo02(@Qualifier("kieContainerLesson01demo02") KieContainer kieContainer) {
        super(kieContainer);
    }

    @Override
    public ApplicationResponse validateApplication(ApplicationDto applicationDto) {
       return super.validateApplication(applicationDto);
    }
}
