package africa.skunkworks.training.drools.insurance.service;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.enums.Status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ApplicationServiceTest extends AbstractServiceTest{

    @Autowired
    private ApplicationService applicationService;

    @Test
    public void validateAllApplications(){

        List<ApplicationDto> applications = applicationService.validateAllApplications();
        assertNotNull(applications);
        assertFalse(applications.isEmpty());
        assertEquals(10,applications.size());

        ApplicationDto application = applications.get(0);
        assertNotNull(application);
        assertEquals("A-100", application.getApplicationNumber());
        assertEquals(Status.DENIED, application.getStatus());

    }

    private List<ApplicationDto> getApplications(){
        return List.of(getApplication("A-100",Boolean.FALSE,Boolean.FALSE,Boolean.FALSE, 26,Status.VALID),
                getApplication("A-101",Boolean.TRUE,Boolean.FALSE,Boolean.FALSE, 18,Status.VALID),
                getApplication("A-102",Boolean.TRUE,Boolean.FALSE,Boolean.TRUE, 26,Status.VALID),
                getApplication("A-103",Boolean.FALSE,Boolean.TRUE,Boolean.FALSE, 26,Status.PENDING));
    }

    private ApplicationDto getApplication(String applicationNumber, Boolean isEmployed, Boolean isSmoker, Boolean pec, Integer clientAge, Status status){
        return ApplicationDto.builder()
                .applicationNumber(applicationNumber)
                .isEmployed(isEmployed)
                .isSmoker(isSmoker)
                .pec(pec)
                .clientAge(clientAge)
                .status(status)
                .build();
    }




}
