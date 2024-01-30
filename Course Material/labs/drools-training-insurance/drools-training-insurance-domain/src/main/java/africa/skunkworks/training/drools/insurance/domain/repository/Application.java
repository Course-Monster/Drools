package africa.skunkworks.training.drools.insurance.domain.repository;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "APPLICATION", schema = "DROOLS_TRAINING_INSURANCE")
public class Application implements Serializable {

    @Serial
    private static final long serialVersionUID = 3935748353136372434L;

    @Id
    @Column(name = "APPLICATION_NUMBER")
    private String applicationNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CLIENT_ID", referencedColumnName = "CLIENT_ID")
    private Client client;

    @Column(name = "PEC")
    private Boolean pec;

    @Column(name = "RISK")
    private String risk;

    @Column(name = "BMI")
    private String bmi;

    public Application() {
    }

    public String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Boolean getPec() {
        return pec;
    }

    public void setPec(Boolean pec) {
        this.pec = pec;
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Application that = (Application) o;
        return Objects.equals(applicationNumber, that.applicationNumber) && Objects.equals(client, that.client) && Objects.equals(pec, that.pec) && Objects.equals(risk, that.risk) && Objects.equals(bmi, that.bmi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationNumber, client, pec, risk, bmi);
    }

    @Override
    public String toString() {
        return "Application{" +
                "applicationNumber='" + applicationNumber + '\'' +
                ", client=" + client +
                ", pec='" + pec + '\'' +
                ", risk='" + risk + '\'' +
                ", bmi='" + bmi + '\'' +
                '}';
    }
}
