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

public class ValidateApplicationAndClientIdentificationLesson03Demo02Test extends AbstractRuleTest {

    @Autowired
    @Qualifier("validateApplicationAndClientIdentificationLesson03Demo02")
    private ValidateApplication validateApplication;

    @Test
    public void validateApplication(){
        //Invalidate applications with missing ID
        ApplicationDto applicationDto = getApplication(18, Boolean.FALSE, Boolean.TRUE);
        applicationDto.setClientIdentificationNumber("ID-100");

        ClientIdentificationDto clientIdentificationDto = getClientIdentification("John Smith", "ID-999", LocalDate.now());

        ApplicationResponse response = validateApplication.validateApplication(applicationDto, clientIdentificationDto);
        assertNotNull(response);
        assertEquals(Status.DENIED, applicationDto.getStatus());

        //Invalidate applications with incorrect name
        applicationDto = getApplication(18, Boolean.FALSE, Boolean.TRUE);
        applicationDto.setClientIdentificationNumber("ID-100");

        clientIdentificationDto = getClientIdentification("John Lennon", "ID-100", LocalDate.now());

        response = validateApplication.validateApplication(applicationDto, clientIdentificationDto);
        assertNotNull(response);
        assertEquals(Status.DENIED, applicationDto.getStatus());

        //Invalidate applications with Expired ID
        applicationDto = getApplication(18, Boolean.FALSE, Boolean.TRUE);
        applicationDto.setClientIdentificationNumber("ID-100");

        clientIdentificationDto = getClientIdentification("John Lennon", "ID-100", LocalDate.of(2023,12,15));

        response = validateApplication.validateApplication(applicationDto, clientIdentificationDto);
        assertNotNull(response);
        assertEquals(Status.DENIED, applicationDto.getStatus());
    }
}
