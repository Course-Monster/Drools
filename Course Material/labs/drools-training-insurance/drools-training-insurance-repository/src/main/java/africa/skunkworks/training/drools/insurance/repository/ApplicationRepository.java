package africa.skunkworks.training.drools.insurance.repository;

import africa.skunkworks.training.drools.insurance.domain.repository.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, String> {
}
