package africa.skunkworks.training.drools.insurance.rule.lesson02;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.enums.Status;
import africa.skunkworks.training.drools.insurance.domain.response.ApplicationResponse;
import africa.skunkworks.training.drools.insurance.rule.AbstractRuleTest;
import africa.skunkworks.training.drools.insurance.rule.ValidateApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ValidateApplicationLesson02Demo01Test extends AbstractRuleTest {

    @Autowired
    @Qualifier("validateApplicationLesson02Demo01")
    private ValidateApplication validateApplication;

    @Test
    public void validateApplication(){
        //Invalidate application if not employed
        ApplicationDto applicationDto = getApplication(25, Boolean.FALSE, Boolean.FALSE);
        ApplicationResponse response = validateApplication.validateApplication(applicationDto);
        assertNotNull(response);
        assertEquals(Status.DENIED, applicationDto.getStatus());

        //Invalidate application from minor
        applicationDto = getApplication(17, Boolean.FALSE, Boolean.TRUE);
        response = validateApplication.validateApplication(applicationDto);
        assertNotNull(response);
        assertEquals(Status.DENIED, applicationDto.getStatus());

        //Invalid application – has pre-existing conditions
        applicationDto = getApplication(25, Boolean.TRUE, Boolean.TRUE);
        response = validateApplication.validateApplication(applicationDto);
        assertNotNull(response);
        assertEquals(Status.DENIED, applicationDto.getStatus());

        //Valid Application
        applicationDto = getApplication(25, Boolean.FALSE, Boolean.TRUE);
        applicationDto.setStatus(Status.PENDING);
        response = validateApplication.validateApplication(applicationDto);
        assertNotNull(response);
        assertEquals(Status.APPROVED, applicationDto.getStatus());

    }
}
