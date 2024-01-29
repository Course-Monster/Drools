package africa.skunkworks.training.drools.insurance.web;

import africa.skunkworks.training.drools.insurance.domain.util.Language;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public abstract class AbstractWebTest {

    @Autowired
    protected MockMvc mockMvc;

    protected String objectToJsonString(Object object){
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(object);
        }catch (Exception e) {
            String errorMessage = String.format("Unable to convert class [%s] to json String. Caught a %s. %s", object.getClass().getCanonicalName(), e.getClass().getCanonicalName(), e.getMessage());
            throw new RuntimeException(errorMessage, e);
        }
    }

    protected Language getLanguage(){
        return new Language("en","ZA");
    }
}
