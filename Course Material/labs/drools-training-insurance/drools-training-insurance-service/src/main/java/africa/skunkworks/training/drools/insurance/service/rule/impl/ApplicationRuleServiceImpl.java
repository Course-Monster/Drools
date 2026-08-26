package africa.skunkworks.training.drools.insurance.service.rule.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.rule.application.ApplicationValidationRule;
import africa.skunkworks.training.drools.insurance.service.rule.ApplicationRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationRuleServiceImpl implements ApplicationRuleService {
    private final ApplicationValidationRule applicationValidationRule;

    @Autowired
    public ApplicationRuleServiceImpl(ApplicationValidationRule applicationValidationRule) {
        this.applicationValidationRule = applicationValidationRule;
    }

    @Override
    public void validateApplication(ApplicationDto applicationDto, String agendaGroup) {
        applicationValidationRule.validateApplication(applicationDto,agendaGroup);
    }
}
