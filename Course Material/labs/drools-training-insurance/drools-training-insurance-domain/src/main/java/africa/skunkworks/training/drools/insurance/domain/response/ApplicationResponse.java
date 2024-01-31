package africa.skunkworks.training.drools.insurance.domain.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = 5918719628288477310L;

    private String response;
}
