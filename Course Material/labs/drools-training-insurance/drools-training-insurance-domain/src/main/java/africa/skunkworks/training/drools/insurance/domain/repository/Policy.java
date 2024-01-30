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
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "POLICY", schema = "DROOLS_TRAINING_INSURANCE")
public class Policy implements Serializable {
    @Serial
    private static final long serialVersionUID = 3973908610338460947L;

    @Id
    @Column(name = "POLICY_NUMBER")
    private String policyNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CLIENT_ID", referencedColumnName = "CLIENT_ID")
    private Client client;

    @Column(name = "PREMIUM")
    private BigDecimal premium;

    @Column(name = "COVERAGE")
    private BigDecimal coverage;

    @Column(name = "STATUS")
    private String status;

    public Policy() {
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public BigDecimal getPremium() {
        return premium;
    }

    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }

    public BigDecimal getCoverage() {
        return coverage;
    }

    public void setCoverage(BigDecimal coverage) {
        this.coverage = coverage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Policy policy = (Policy) o;
        return Objects.equals(policyNumber, policy.policyNumber) && Objects.equals(client, policy.client) && Objects.equals(premium, policy.premium) && Objects.equals(coverage, policy.coverage) && Objects.equals(status, policy.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber, client, premium, coverage, status);
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", client=" + client +
                ", premium=" + premium +
                ", coverage=" + coverage +
                ", status='" + status + '\'' +
                '}';
    }
}
