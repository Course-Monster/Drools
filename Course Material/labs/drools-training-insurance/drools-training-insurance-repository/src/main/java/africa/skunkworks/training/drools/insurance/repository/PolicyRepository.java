package africa.skunkworks.training.drools.insurance.repository;

import africa.skunkworks.training.drools.insurance.domain.repository.Policy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRepository extends JpaRepository<Policy,String> {
}
