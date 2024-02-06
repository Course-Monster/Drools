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

}
