package africa.skunkworks.training.drools.insurance.rule.lesson03;

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

public class ValidateApplicationLesson3Demo0302Test extends AbstractRuleTest {

    @Autowired
    @Qualifier("validateApplicationLesson3Demo0302")
    private ValidateApplication validateApplication;

    @Test
    public void validateApplicationUnemployed(){
        //Invalidate application if not employed
        ApplicationDto applicationDto = getApplication(18, Boolean.FALSE, Boolean.FALSE);
        applicationDto.setStatus(Status.INVALID);

        ApplicationResponse response = validateApplication.validateApplication(applicationDto);
        assertNotNull(response);
        assertEquals(Status.DENIED, applicationDto.getStatus());
        System.out.println("++++++++++++++++++++++++++++++++++++++++ SCENARIO 1 ++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(response.getResponse());
    }

    @Test
    public void validateApplicationMinor(){
        //Invalidate application from minor
        ApplicationDto applicationDto = getApplication(15, Boolean.FALSE, Boolean.TRUE);
        applicationDto.setStatus(Status.INVALID);

        ApplicationResponse response = validateApplication.validateApplication(applicationDto);
        assertNotNull(response);
        assertEquals(Status.DENIED, applicationDto.getStatus());
        System.out.println("++++++++++++++++++++++++++++++++++++++++ SCENARIO 2 ++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(response.getResponse());
    }

    @Test
    public void validateApplicationPec(){
        //Invalid application – has pre-existing conditions
        ApplicationDto applicationDto = getApplication(25, Boolean.TRUE, Boolean.TRUE);
        applicationDto.setStatus(Status.INVALID);

        ApplicationResponse response = validateApplication.validateApplication(applicationDto);
        assertNotNull(response);
        assertEquals(Status.DENIED, applicationDto.getStatus());
        System.out.println("++++++++++++++++++++++++++++++++++++++++ SCENARIO 3 ++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(response.getResponse());
    }

    @Test
    public void validateApplication(){
        //Invalid application – has pre-existing conditions
        ApplicationDto applicationDto = getApplication(25, Boolean.FALSE, Boolean.TRUE);
        applicationDto.setStatus(Status.PENDING);

        ApplicationResponse response = validateApplication.validateApplication(applicationDto);
        assertNotNull(response);
        assertEquals(Status.APPROVED, applicationDto.getStatus());
        System.out.println("++++++++++++++++++++++++++++++++++++++++ SCENARIO 4 ++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(response.getResponse());
    }
}
