package africa.skunkworks.training.drools.insurance.rule.lesson01.demo01;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.rule.AbstractRuleTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidateApplicationDemo01Test extends AbstractRuleTest {

    @Autowired
    @Qualifier("validateApplicationLesson01Demo01")
    private ValidateApplication validateApplication;

    @Test
    public void validateApplication(){
        //Invalid application
        ApplicationDto applicationDto = getApplication(17, Boolean.TRUE, Boolean.FALSE);

        validateApplication.validateApplication(applicationDto);
        assertEquals("Ivan Guambe", applicationDto.getReason());
    }

    private ApplicationDto getApplication(Integer clientAge, Boolean pec, Boolean isEmployed){
        return ApplicationDto.builder()
                .clientAge(clientAge)
                .pec(pec)
                .isEmployed(isEmployed)
                .build();
    }
}
