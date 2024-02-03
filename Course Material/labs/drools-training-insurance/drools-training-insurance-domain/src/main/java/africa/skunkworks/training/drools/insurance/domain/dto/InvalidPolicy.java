package africa.skunkworks.training.drools.insurance.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
public class InvalidPolicy implements Serializable {

    @Serial
    private static final long serialVersionUID = -6713081549489970745L;

    private PolicyDto policy;
}
