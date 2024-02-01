package africa.skunkworks.training.drools.insurance.rule.lesson01;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.response.ApplicationResponse;
import africa.skunkworks.training.drools.insurance.rule.AbstractRuleTest;
import africa.skunkworks.training.drools.insurance.rule.ValidateApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ValidateApplicationLesson01Demo04Test extends AbstractRuleTest {

    @Autowired
    @Qualifier("validateApplicationLesson01Demo04")
    private ValidateApplication validateApplication;

    @Test
    public void validateApplication(){

        //Invalid application - minor
        ApplicationDto applicationDto = getApplication(17, Boolean.FALSE, Boolean.TRUE);
        ApplicationResponse response = validateApplication.validateApplication(applicationDto);
        assertNotNull(response);
        assertEquals("DENIED", response.getStatus());

        // "Invalid application - Pre-existing Condition"
        applicationDto = getApplication(25, Boolean.TRUE, Boolean.TRUE);
        response = validateApplication.validateApplication(applicationDto);
        assertNotNull(response);
        assertEquals("DENIED", response.getStatus());

        // Valid Application
        applicationDto = getApplication(25, Boolean.FALSE, Boolean.TRUE);
        response = validateApplication.validateApplication(applicationDto);
        assertNotNull(response);
        assertEquals("APPROVED", response.getStatus());

    }
}
