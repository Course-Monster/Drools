package africa.skunkworks.training.drools.insurance.repository;

import africa.skunkworks.training.drools.insurance.domain.repository.Client;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ClientRepositoryTest extends AbstractRepositoryTest{

    @Autowired
    private ClientRepository clientRepository;

    @Test
    public void listAllClients(){
        List<Client> clients = clientRepository.findAll();
        assertNotNull(clients);
        assertFalse(clients.isEmpty());
        assertEquals(10, clients.size());
    }
}
