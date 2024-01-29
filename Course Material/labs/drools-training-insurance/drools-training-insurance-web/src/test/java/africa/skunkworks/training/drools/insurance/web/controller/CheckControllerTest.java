package africa.skunkworks.training.drools.insurance.web.controller;

import africa.skunkworks.training.drools.insurance.web.AbstractWebTest;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class CheckControllerTest extends AbstractWebTest {

    @Test
    public void check() throws Exception {

        mockMvc.perform(get("/check/status")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }
}
