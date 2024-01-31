package africa.skunkworks.training.drools.insurance.service.repository;

import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;
import africa.skunkworks.training.drools.insurance.domain.repository.Claim;
import africa.skunkworks.training.drools.insurance.repository.ClaimRepository;
import africa.skunkworks.training.drools.insurance.service.AbstractServiceTest;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ClaimServiceTest extends AbstractServiceTest {

    @MockBean
    private ClaimRepository claimRepository;

    @Autowired
    private ClaimService claimService;

    @Test
    public void listAllClaims(){
        when(claimRepository.findAll()).thenReturn(getClaims());

        List<ClaimDto> claims = claimService.listAllClaims();
        assertNotNull(claims);
        assertFalse(claims.isEmpty());
        assertEquals(2, claims.size());

        verify(claimRepository).findAll();
    }

    private List<Claim> getClaims(){
        return List.of(getClaim("C-101",LocalDate.of(2024,1,20),BigDecimal.valueOf(19000),"P-101", BigDecimal.valueOf(1500),BigDecimal.valueOf(150000),"Paid"),
                getClaim("C-102",LocalDate.of(2022,10,24),BigDecimal.valueOf(1000),"P-102", BigDecimal.valueOf(15000),BigDecimal.valueOf(15000),"Pending"));

    }

    private Claim getClaim(String claimId, LocalDate dateOfClaim, BigDecimal claimAmount, String policyNumber, BigDecimal premium, BigDecimal coverage, String status ){
        Claim claim = new Claim();
        claim.setDateOfClaim(dateOfClaim);
        claim.setClaimAmount(claimAmount);
        claim.setClaimId(claimId);
        claim.setPolicy(getPolicy(policyNumber,premium,coverage,status));
        return claim;
    }
}
