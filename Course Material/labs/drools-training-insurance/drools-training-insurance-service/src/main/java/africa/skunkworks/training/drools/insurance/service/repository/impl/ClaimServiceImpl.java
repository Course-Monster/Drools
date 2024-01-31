package africa.skunkworks.training.drools.insurance.service.repository.impl;

import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;
import africa.skunkworks.training.drools.insurance.repository.ClaimRepository;
import africa.skunkworks.training.drools.insurance.service.repository.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClaimServiceImpl implements ClaimService {

    private final ClaimRepository claimRepository;


    @Autowired
    public ClaimServiceImpl(ClaimRepository claimRepository) {
        this.claimRepository = claimRepository;
    }

    @Override
    public List<ClaimDto> listAllClaims() {
        List<ClaimDto> claims = new ArrayList<>();

        claimRepository.findAll().forEach(claim -> {
            claims.add(
                    ClaimDto.builder()
                            .clientName(claim.getPolicy().getClient().getClientName())
                            .claimAmount(claim.getClaimAmount().doubleValue())
                            .dateOfClaim(claim.getDateOfClaim())
                            .policyNumber(claim.getPolicy().getPolicyNumber())
                            .build()
            );
        });
        return claims;
    }
}
