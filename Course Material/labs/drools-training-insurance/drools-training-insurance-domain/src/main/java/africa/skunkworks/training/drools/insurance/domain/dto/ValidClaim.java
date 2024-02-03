package africa.skunkworks.training.drools.insurance.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
public class ValidClaim implements Serializable {

    @Serial
    private static final long serialVersionUID = 5818718485937939526L;

    private ClaimDto claim;
}
