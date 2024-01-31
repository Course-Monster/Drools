package africa.skunkworks.training.drools.insurance.rule;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.rule.config.RuleConfig;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {RuleConfig.class})
public abstract class AbstractRuleTest {
    protected ApplicationDto getApplication(Integer clientAge, Boolean pec, Boolean isEmployed){
        return ApplicationDto.builder()
                .clientAge(clientAge)
                .pec(pec)
                .isEmployed(isEmployed)
                .build();
    }
}
