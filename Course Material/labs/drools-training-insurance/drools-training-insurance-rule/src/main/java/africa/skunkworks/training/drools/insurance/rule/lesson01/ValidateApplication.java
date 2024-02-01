package africa.skunkworks.training.drools.insurance.rule.lesson01;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.response.ApplicationResponse;

public interface ValidateApplication {

    ApplicationResponse validateApplication(ApplicationDto applicationDto);
}
