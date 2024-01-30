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
@Table(name = "CLIENT_IDENTIFICATION", schema = "DROOLS_TRAINING_INSURANCE")
public class ClientIdentification implements Serializable {

    @Serial
    private static final long serialVersionUID = -3286886496062449225L;

    @Id
    @Column(name = "IDENTIFICATION_NUMBER")
    private String identificationNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CLIENT_ID", referencedColumnName = "CLIENT_ID")
    private Client client;

    @Column(name = "IS_EXPIRED")
    private boolean isExpired;

    public ClientIdentification() {
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientIdentification that = (ClientIdentification) o;
        return isExpired == that.isExpired && Objects.equals(identificationNumber, that.identificationNumber) && Objects.equals(client, that.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificationNumber, client, isExpired);
    }

    @Override
    public String toString() {
        return "ClientIdentification{" +
                "identificationNumber='" + identificationNumber + '\'' +
                ", client=" + client +
                ", isExpired=" + isExpired +
                '}';
    }
}
