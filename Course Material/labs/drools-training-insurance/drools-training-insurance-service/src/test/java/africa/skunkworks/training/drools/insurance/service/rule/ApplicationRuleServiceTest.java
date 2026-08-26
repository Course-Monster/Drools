package africa.skunkworks.training.drools.insurance.service.rule;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.rule.application.ApplicationValidationRule;
import africa.skunkworks.training.drools.insurance.service.AbstractServiceTest;
import org.apache.commons.lang.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

public class ApplicationRuleServiceTest extends AbstractServiceTest {

    @MockBean
    private ApplicationValidationRule applicationValidationRule;

    @Autowired
    private ApplicationRuleService applicationRuleService;

    @Test
    public void validateApplication(){
        ApplicationDto applicationDto = getApplication();

        doNothing().when(applicationValidationRule).validateApplication(applicationDto,"valid-application");

        applicationRuleService.validateApplication(applicationDto, "valid-application");

        verify(applicationValidationRule).validateApplication(applicationDto,"valid-application");
    }

    private ApplicationDto getApplication(){
       return ApplicationDto.builder()
               .applicationNumber("A-100")
               .bmi(24)
               .pec(Boolean.FALSE)
               .isEmployed(Boolean.TRUE)
               .risk("Medium")
               .clientAge(30)
               .isSmoker(Boolean.FALSE)
               .clientIdentificationNumber("ID-100")
               .clientName("Quentin Tarantino")
               .reason(StringUtils.EMPTY)
               .build();
    }
}
