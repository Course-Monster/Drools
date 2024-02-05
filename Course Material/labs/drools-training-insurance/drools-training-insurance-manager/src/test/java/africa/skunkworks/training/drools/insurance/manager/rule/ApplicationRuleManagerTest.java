package africa.skunkworks.training.drools.insurance.manager.rule;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.web.response.Response;
import africa.skunkworks.training.drools.insurance.manager.AbstractManagerTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ApplicationRuleManagerTest extends AbstractManagerTest {

    @Autowired
    private ApplicationRuleManager applicationRuleManager;
    @Test
    public void fireApplicationRules(){
        Response<List<ApplicationDto>> response = applicationRuleManager.fireApplicationRules();
        assertNotNull(response);
        assertTrue(response.isSuccessful());
        assertNotNull(response.getPayload());
        assertFalse(response.getPayload().isEmpty());
        assertEquals(10, response.getPayload().size());
    }
}
