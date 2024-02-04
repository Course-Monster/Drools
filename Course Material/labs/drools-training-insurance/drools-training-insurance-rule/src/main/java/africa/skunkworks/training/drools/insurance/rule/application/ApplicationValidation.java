package africa.skunkworks.training.drools.insurance.rule.application;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;

public interface ApplicationValidation {

    void validateApplication(ApplicationDto applicationDto, String agendaGroup);
}
