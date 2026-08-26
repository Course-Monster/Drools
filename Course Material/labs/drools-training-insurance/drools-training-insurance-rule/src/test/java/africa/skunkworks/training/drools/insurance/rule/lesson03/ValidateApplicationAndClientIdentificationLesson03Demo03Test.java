package africa.skunkworks.training.drools.insurance.rule.lesson03;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.dto.ClientIdentificationDto;
import africa.skunkworks.training.drools.insurance.domain.enums.Status;
import africa.skunkworks.training.drools.insurance.domain.response.ApplicationResponse;
import africa.skunkworks.training.drools.insurance.rule.AbstractRuleTest;
import africa.skunkworks.training.drools.insurance.rule.ValidateApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ValidateApplicationAndClientIdentificationLesson03Demo03Test extends AbstractRuleTest {

    @Autowired
    @Qualifier("validateApplicationAndClientIdentificationLesson03Demo03")
    private ValidateApplication validateApplication;

    @Test
    public void validateApplicationMissingId(){
        //Invalidate applications with missing ID
        ApplicationDto applicationDto = getApplication(18, Boolean.FALSE, Boolean.TRUE);
        applicationDto.setClientIdentificationNumber("ID-100");
        applicationDto.setStatus(Status.VALID);

        ClientIdentificationDto clientIdentificationDto = getClientIdentification("John Smith", "ID-999", LocalDate.now());

        ApplicationResponse response = validateApplication.validateApplication(applicationDto, clientIdentificationDto);
        assertNotNull(response);
        assertEquals(Status.DENIED, applicationDto.getStatus());
        System.out.println("++++++++++++++++++++++++++++++++++++++++ SCENARIO 1 ++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(response.getResponse());


    }

    @Test
    public void validateApplicationIncorrectName(){
        ApplicationDto applicationDto = getApplication(18, Boolean.FALSE, Boolean.TRUE);
        applicationDto.setClientIdentificationNumber("ID-100");
        applicationDto.setClientName("John Lennon");
        applicationDto.setStatus(Status.VALID);

        ClientIdentificationDto clientIdentificationDto = getClientIdentification("John Smith", "ID-100", LocalDate.now());

        ApplicationResponse response = validateApplication.validateApplication(applicationDto, clientIdentificationDto);
        assertNotNull(response);
        assertEquals(Status.DENIED, applicationDto.getStatus());
        System.out.println("++++++++++++++++++++++++++++++++++++++++ SCENARIO 2 ++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(response.getResponse());
    }

    @Test
    public void validateApplicationExpiredId(){

        //Invalidate applications with Expired ID
        ApplicationDto applicationDto = getApplication(18, Boolean.FALSE, Boolean.TRUE);
        applicationDto.setClientIdentificationNumber("ID-100");
        applicationDto.setStatus(Status.VALID);

        ClientIdentificationDto clientIdentificationDto = getClientIdentification("John Lennon", "ID-100", LocalDate.of(2023,12,15));

        ApplicationResponse response = validateApplication.validateApplication(applicationDto, clientIdentificationDto);
        assertNotNull(response);
        assertEquals(Status.DENIED, applicationDto.getStatus());
        System.out.println("++++++++++++++++++++++++++++++++++++++++ SCENARIO 3 ++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(response.getResponse());

    }
}
