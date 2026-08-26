package africa.skunkworks.training.drools.insurance.service;

import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;

import java.util.List;

public interface ClaimValidationService {

    List<ClaimDto> validateAllClaims();
}
