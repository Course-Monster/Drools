package africa.skunkworks.training.drools.insurance.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
public class Payout implements Serializable {

    @Serial
    private static final long serialVersionUID = 641444564784602066L;

    private String policyNumber;

    private Double claimAmount;
}
