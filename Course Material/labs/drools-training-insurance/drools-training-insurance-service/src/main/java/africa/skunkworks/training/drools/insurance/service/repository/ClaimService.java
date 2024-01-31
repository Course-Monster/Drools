package africa.skunkworks.training.drools.insurance.service.repository;

import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;

import java.util.List;

public interface ClaimService {

    List<ClaimDto> listAllClaims();
}
