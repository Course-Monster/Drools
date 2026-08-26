package africa.skunkworks.training.drools.insurance.service;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;

import java.util.List;

public interface ApplicationService {

    List<ApplicationDto> validateAllApplications();
}
