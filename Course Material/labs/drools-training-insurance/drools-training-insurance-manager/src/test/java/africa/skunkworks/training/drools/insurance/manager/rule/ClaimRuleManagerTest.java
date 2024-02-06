package africa.skunkworks.training.drools.insurance.manager.rule;

import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;
import africa.skunkworks.training.drools.insurance.domain.web.response.Response;
import africa.skunkworks.training.drools.insurance.manager.AbstractManagerTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClaimRuleManagerTest extends AbstractManagerTest {

    @Autowired
    private ClaimRuleManager claimRuleManager;

    @Test
    public void fireClaimRules(){
        Response<List<ClaimDto>> response = claimRuleManager.fireClaimRules();
        assertNotNull(response);
        assertTrue(response.isSuccessful());
        assertNotNull(response.getPayload());
        assertFalse(response.getPayload().isEmpty());
        assertEquals(5, response.getPayload().size());
    }
}
