package africa.skunkworks.training.drools.insurance.service.repository;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;

import java.util.List;

public interface ApplicationService {

    List<ApplicationDto> listAllApplications();
}
