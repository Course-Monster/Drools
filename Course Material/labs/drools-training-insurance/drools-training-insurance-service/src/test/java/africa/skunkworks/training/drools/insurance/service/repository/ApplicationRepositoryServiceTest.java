package africa.skunkworks.training.drools.insurance.service.repository;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.repository.Application;
import africa.skunkworks.training.drools.insurance.repository.ApplicationRepository;
import africa.skunkworks.training.drools.insurance.service.AbstractServiceTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ApplicationRepositoryServiceTest extends AbstractServiceTest {

    @MockBean
    private ApplicationRepository applicationRepository;

    @Autowired
    private ApplicationRepositoryService applicationService;

    @Test
    public void listAllApplications(){
        when(applicationRepository.findAll()).thenReturn(getApplications());

        List<ApplicationDto> applicationDtos = applicationService.listAllApplications();
        assertNotNull(applicationDtos);
        assertFalse(applicationDtos.isEmpty());
        assertEquals(2, applicationDtos.size());

        verify(applicationRepository).findAll();

    }

    private List<Application> getApplications(){
        return List.of(getApplication("A-101", Boolean.TRUE,"Medium","21"),
                getApplication("A-102",Boolean.FALSE,"High", "34"));
    }

    private Application getApplication(String applicationNumber,Boolean pec, String risk,String bmi ){
        Application application = new Application();
        application.setApplicationNumber(applicationNumber);
        application.setBmi(bmi);
        application.setPec(pec);
        application.setRisk(risk);
        application.setClient(getClient());
        return application;
    }

}
