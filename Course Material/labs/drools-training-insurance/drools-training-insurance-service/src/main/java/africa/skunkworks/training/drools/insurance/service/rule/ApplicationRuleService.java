package africa.skunkworks.training.drools.insurance.service.rule;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;

public interface ApplicationRuleService {

    void validateApplication(ApplicationDto applicationDto, String agendaGroup);
}
