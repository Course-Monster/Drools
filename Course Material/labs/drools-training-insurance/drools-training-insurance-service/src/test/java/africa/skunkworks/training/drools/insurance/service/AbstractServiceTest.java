package africa.skunkworks.training.drools.insurance.service;

import africa.skunkworks.training.drools.insurance.domain.repository.Client;
import africa.skunkworks.training.drools.insurance.domain.repository.ClientIdentification;
import africa.skunkworks.training.drools.insurance.domain.repository.Policy;
import africa.skunkworks.training.drools.insurance.service.config.ServiceConfig;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootTest(classes = {ServiceConfig.class})
public abstract class AbstractServiceTest {

    protected Client getClient(){
        Client client = new Client();
        client.setClientId("01");
        client.setClientName("Quentin Tarantino");
        client.setClientIdentification(getClientIdentification());
        client.setEmployed(Boolean.TRUE);
        client.setSmoker(Boolean.FALSE);
        client.setAnnualIncome(BigDecimal.valueOf(150000));
        client.setBirthdate(LocalDate.of(1969,5,20));
        return client;
    }

    protected Policy getPolicy(String policyNumber, BigDecimal premium, BigDecimal coverage, String status){
        Policy policy = new Policy();
        policy.setClient(getClient());
        policy.setPolicyNumber(policyNumber);
        policy.setCoverage(coverage);
        policy.setStatus(status);
        policy.setPremium(premium);
        return policy;
    }

    private ClientIdentification getClientIdentification(){
        ClientIdentification clientIdentification = new ClientIdentification();
        clientIdentification.setIdentificationNumber("CLI-001");
        clientIdentification.setExpired(Boolean.FALSE);
        return clientIdentification;
    }
}
