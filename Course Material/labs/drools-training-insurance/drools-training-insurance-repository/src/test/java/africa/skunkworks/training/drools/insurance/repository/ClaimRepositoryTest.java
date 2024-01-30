package africa.skunkworks.training.drools.insurance.repository;

import africa.skunkworks.training.drools.insurance.domain.repository.Claim;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ClaimRepositoryTest extends AbstractRepositoryTest{

    @Autowired
    private ClaimRepository claimRepository;

    @Test
    public void listAllClaims(){
        List<Claim> claims = claimRepository.findAll();
        assertNotNull(claims);
        assertFalse(claims.isEmpty());
        assertEquals(5, claims.size());
    }
}
