package africa.skunkworks.training.drools.insurance.service.repository;

import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;

import java.util.List;

public interface PolicyService {

    List<PolicyDto> listAllPolicies();
}