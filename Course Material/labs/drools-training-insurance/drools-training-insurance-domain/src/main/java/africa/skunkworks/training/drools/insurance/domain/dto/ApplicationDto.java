package africa.skunkworks.training.drools.insurance.domain.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
public class ApplicationDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 6703489643257318421L;

    private String applicationNumber;

    private String clientName;

    private String clientIdentificationNumber;

    private Boolean pec;

    private Boolean isEmployed;

    private Boolean isSmoker;

    private Integer clientAge;

    private Integer bmi;

    private String risk;
}
