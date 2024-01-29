package africa.skunkworks.training.drools.insurance.domain.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Language implements Serializable {
    @Serial
    private static final long serialVersionUID = -7402926643205632377L;

    private String language;

    private String country;
}
