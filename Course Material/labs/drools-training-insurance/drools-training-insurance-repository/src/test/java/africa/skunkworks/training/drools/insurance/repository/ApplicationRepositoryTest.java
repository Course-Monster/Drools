package africa.skunkworks.training.drools.insurance.repository;

import africa.skunkworks.training.drools.insurance.domain.enums.Status;
import africa.skunkworks.training.drools.insurance.domain.repository.Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ApplicationRepositoryTest extends AbstractRepositoryTest{

    @Autowired
    private ApplicationRepository applicationRepository;

    @Test
    public void listAllApplications(){
        List<Application> applications = applicationRepository.findAll();
        assertNotNull(applications);
        assertFalse(applications.isEmpty());
        assertEquals(10,applications.size());

        Application application = applications.get(0);
        assertNotNull(application);
        assertEquals("N/A", application.getReason());
        assertEquals(Status.UNKNOWN,application.getStatus());
    }

}
