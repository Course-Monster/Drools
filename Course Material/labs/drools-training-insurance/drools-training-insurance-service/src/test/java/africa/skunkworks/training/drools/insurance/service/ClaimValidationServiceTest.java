package africa.skunkworks.training.drools.insurance.service;

import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ClaimValidationServiceTest  extends AbstractServiceTest{

    @Autowired
    private ClaimValidationService claimValidationService;

    @Test
    public void validateAllClaims(){
        List<ClaimDto> claimDtos = claimValidationService.validateAllClaims();
        assertNotNull(claimDtos);
        assertFalse(claimDtos.isEmpty());
        assertEquals(5, claimDtos.size());
    }
}
