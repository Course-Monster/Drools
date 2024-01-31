package africa.skunkworks.training.drools.insurance.domain.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
public class PolicyDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 6582096806199526492L;

    private String policyNumber;

    private String clientName;

    private Integer premium;

    private Integer coverage;

    private String paymentStatus;

    private String reason;


}
