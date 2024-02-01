package africa.skunkworks.training.drools.insurance.rule.lesson01;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.response.ApplicationResponse;
import africa.skunkworks.training.drools.insurance.rule.AbstractRuleTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ValidateApplicationLesson01Demo03Test extends AbstractRuleTest {

    @Autowired
    @Qualifier("validateApplicationLesson01Demo03")
    private ValidateApplication validateApplication;

    @Test
    public void validateApplication(){
        //Invalid application from minor
        ApplicationDto applicationDto = getApplication(17, Boolean.FALSE, Boolean.TRUE);
        ApplicationResponse response = validateApplication.validateApplication(applicationDto);
        assertNotNull(response);
       // assertEquals("ApplicationDto(applicationNumber=null, clientName=null, clientIdentificationNumber=null, pec=false, isEmployed=true, isSmoker=null, clientAge=17, bmi=null, risk=null, reason=null, status=null): Invalid – employed: true", response.getResponse());

        //Invalid application – unemployed
        applicationDto = getApplication(25, Boolean.FALSE, Boolean.FALSE);
        response = validateApplication.validateApplication(applicationDto);
        assertNotNull(response);
        //assertEquals("Application Invalid – client is unemployed", response.getResponse());

        applicationDto = getApplication(25, Boolean.TRUE, Boolean.TRUE);
        response = validateApplication.validateApplication(applicationDto);
        assertNotNull(response);

        applicationDto = getApplication(18, Boolean.FALSE, Boolean.FALSE);
        response = validateApplication.validateApplication(applicationDto);
        assertNotNull(response);


        //Valid Application
        applicationDto = getApplication(25, Boolean.FALSE, Boolean.TRUE);
        response = validateApplication.validateApplication(applicationDto);
        assertNotNull(response);
        //assertEquals("ApplicationDto(applicationNumber=null, clientName=null, clientIdentificationNumber=null, pec=false, isEmployed=true, isSmoker=null, clientAge=25, bmi=null, risk=null, reason=null, status=null): Validated", response.getResponse());

    }

}
