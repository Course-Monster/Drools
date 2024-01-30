package africa.skunkworks.training.drools.insurance.repository;

import africa.skunkworks.training.drools.insurance.domain.repository.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, String> {
}
