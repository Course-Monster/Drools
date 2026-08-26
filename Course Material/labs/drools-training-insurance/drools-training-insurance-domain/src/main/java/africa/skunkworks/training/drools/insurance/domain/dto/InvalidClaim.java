package africa.skunkworks.training.drools.insurance.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
public class InvalidClaim implements Serializable {

    @Serial
    private static final long serialVersionUID = -3284128457859671194L;

    private ClaimDto claim;




}
