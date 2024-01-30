package africa.skunkworks.training.drools.insurance.domain.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "CLIENT", schema = "DROOLS_TRAINING_INSURANCE")
public class Client implements Serializable {
    @Serial
    private static final long serialVersionUID = -6311969905078663255L;

    @Id
    @Column(name = "CLIENT_ID")
    private String clientId;

    @Column(name = "CLIENT_NAME")
    private String clientName;

    @Column(name = "BIRTHDATE")
    private LocalDate birthdate;

    @Column(name = "IS_SMOKER")
    private Boolean isSmoker;

    @Column(name = "IS_EMPLOYED")
    private Boolean isEmployed;

    @Column(name = "ANNUAL_INCOME")
    private BigDecimal annualIncome;

    @OneToOne(mappedBy = "client")
    private ClientIdentification clientIdentification;

    public Client() {
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Boolean getSmoker() {
        return isSmoker;
    }

    public void setSmoker(Boolean smoker) {
        isSmoker = smoker;
    }

    public Boolean getEmployed() {
        return isEmployed;
    }

    public void setEmployed(Boolean employed) {
        isEmployed = employed;
    }

    public BigDecimal getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(BigDecimal annualIncome) {
        this.annualIncome = annualIncome;
    }

    public ClientIdentification getClientIdentification() {
        return clientIdentification;
    }

    public void setClientIdentification(ClientIdentification clientIdentification) {
        this.clientIdentification = clientIdentification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(clientId, client.clientId) && Objects.equals(clientName, client.clientName) && Objects.equals(birthdate, client.birthdate) && Objects.equals(isSmoker, client.isSmoker) && Objects.equals(isEmployed, client.isEmployed) && Objects.equals(annualIncome, client.annualIncome) && Objects.equals(clientIdentification, client.clientIdentification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, clientName, birthdate, isSmoker, isEmployed, annualIncome, clientIdentification);
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId='" + clientId + '\'' +
                ", clientName='" + clientName + '\'' +
                ", birthdate=" + birthdate +
                ", isSmoker=" + isSmoker +
                ", isEmployed=" + isEmployed +
                ", annualIncome=" + annualIncome +
                ", clientIdentification=" + clientIdentification +
                '}';
    }
}
