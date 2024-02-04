package africa.skunkworks.training.drools.insurance.rule.application;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.enums.Status;
import africa.skunkworks.training.drools.insurance.rule.AbstractRuleTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ApplicationValidationTest extends AbstractRuleTest {


    @Autowired
    private ApplicationValidationRule applicationValidation;

    @Test
    public void validateApplicationIfNotEmployed(){
        ApplicationDto application = getApplication(30, Boolean.FALSE,Boolean.FALSE);
        application.setApplicationNumber("A-100");

        applicationValidation.validateApplication(application,"not-employed");

        assertNotNull(application);
        assertEquals(Status.DENIED, application.getStatus());

    }

    @Test
    public void validateApplicationMinor(){
        ApplicationDto application = getApplication(15, Boolean.FALSE,Boolean.TRUE);
        application.setApplicationNumber("A-101");

        applicationValidation.validateApplication(application,"application-minor");

        assertNotNull(application);
        assertEquals(Status.DENIED, application.getStatus());

    }

    @Test
    public void validateApplicationPec(){
        ApplicationDto application = getApplication(25, Boolean.TRUE,Boolean.TRUE);
        application.setApplicationNumber("A-101");

        applicationValidation.validateApplication(application,"application-pec");

        assertNotNull(application);
        assertEquals(Status.DENIED, application.getStatus());

    }

    @Test
    public void validateApplication(){
        ApplicationDto application = getApplication(25, Boolean.FALSE,Boolean.TRUE);
        application.setApplicationNumber("A-104");
        application.setStatus(Status.PENDING);

        applicationValidation.validateApplication(application,"valid-application");

        assertNotNull(application);
        assertEquals(Status.APPROVED, application.getStatus());
    }
}
