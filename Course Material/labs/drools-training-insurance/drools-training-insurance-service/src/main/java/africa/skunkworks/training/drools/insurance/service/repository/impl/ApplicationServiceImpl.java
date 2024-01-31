package africa.skunkworks.training.drools.insurance.service.repository.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.repository.Client;
import africa.skunkworks.training.drools.insurance.repository.ApplicationRepository;
import africa.skunkworks.training.drools.insurance.service.repository.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    private final ApplicationRepository applicationRepository;

    @Autowired
    public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    @Override
    public List<ApplicationDto> listAllApplications() {
        List<ApplicationDto> applications = new ArrayList<>();

        applicationRepository.findAll().forEach( application -> {
            Client client = application.getClient();
            applications.add(
              ApplicationDto.builder()
                      .applicationNumber(application.getApplicationNumber())
                      .clientAge(getAge(client.getBirthdate()))
                      .clientIdentificationNumber(client.getClientIdentification().getIdentificationNumber())
                      .isEmployed(client.getEmployed())
                      .isSmoker(client.getSmoker())
                      .bmi(Integer.valueOf(application.getBmi()))
                      .pec(application.getPec())
                      .build()
            );
        });
        return applications;
    }

    private Integer getAge(LocalDate localDate){
        return Period.between(localDate, LocalDate.now()).getYears();
    }
}
