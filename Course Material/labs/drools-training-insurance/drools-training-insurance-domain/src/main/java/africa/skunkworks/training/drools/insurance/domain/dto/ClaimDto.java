package africa.skunkworks.training.drools.insurance.domain.dto;

import africa.skunkworks.training.drools.insurance.domain.enums.Status;
import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
public class ClaimDto implements Serializable {

    @Serial
    private static final long serialVersionUID = -7145980387821913205L;

    private String clientName;

    private String policyNumber;

    private LocalDate dateOfClaim;

    private Double claimAmount;

    private Status status;

    private String reason;
}
