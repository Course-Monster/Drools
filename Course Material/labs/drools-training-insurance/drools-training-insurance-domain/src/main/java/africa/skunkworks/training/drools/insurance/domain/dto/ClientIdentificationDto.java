package africa.skunkworks.training.drools.insurance.domain.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
public class ClientIdentificationDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 4978583599192950429L;

    private String name;

    private String idNumber;

    private LocalDate expiryDate;
}
