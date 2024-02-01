package africa.skunkworks.training.drools.insurance.rule;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.dto.ClientIdentificationDto;
import africa.skunkworks.training.drools.insurance.domain.response.ApplicationResponse;

public interface ValidateApplication {

    ApplicationResponse validateApplication(ApplicationDto applicationDto);

    ApplicationResponse validateApplication(ApplicationDto applicationDto, ClientIdentificationDto clientIdentificationDto);
}
