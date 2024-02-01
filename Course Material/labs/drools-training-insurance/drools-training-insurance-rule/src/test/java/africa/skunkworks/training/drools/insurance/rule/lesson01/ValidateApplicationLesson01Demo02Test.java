package africa.skunkworks.training.drools.insurance.rule.lesson01;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.response.ApplicationResponse;
import africa.skunkworks.training.drools.insurance.rule.AbstractRuleTest;
import africa.skunkworks.training.drools.insurance.rule.ValidateApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ValidateApplicationLesson01Demo02Test extends AbstractRuleTest {

    @Autowired
    @Qualifier("validateApplicationLesson01Demo02")
    private ValidateApplication validateApplication;

    @Test
    public void validateApplication(){
        //Invalid application - underage
        ApplicationDto applicationDto = getApplication(17, Boolean.FALSE, Boolean.TRUE);

        ApplicationResponse response = validateApplication.validateApplication(applicationDto);
        assertNotNull(response);
       // assertEquals("Application Invalid  client is underage", response.getResponse());

        //Invalid application – unemployed
        applicationDto = getApplication(17, Boolean.FALSE, Boolean.FALSE);
        response = validateApplication.validateApplication(applicationDto);
        assertNotNull(response);
       // assertEquals("Application Invalid – client is unemployed", response.getResponse());

        //Invalid application – unemployed
        applicationDto = getApplication(17, Boolean.TRUE, Boolean.FALSE);
        response = validateApplication.validateApplication(applicationDto);
        assertNotNull(response);
        //assertEquals("Application Invalid – client has PECs", response.getResponse());

        //Validate application
        applicationDto = getApplication(25, Boolean.FALSE, Boolean.TRUE);
        response = validateApplication.validateApplication(applicationDto);
        assertNotNull(response);
        //assertEquals("Application Validated", response.getResponse());

    }
}
