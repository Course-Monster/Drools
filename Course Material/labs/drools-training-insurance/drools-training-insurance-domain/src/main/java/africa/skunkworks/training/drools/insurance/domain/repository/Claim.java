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
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "CLAIM", schema = "DROOLS_TRAINING_INSURANCE")
public class Claim implements Serializable {
    @Serial
    private static final long serialVersionUID = -1372100353002111042L;

    @Id
    @Column(name = "CLAIM_ID")
    private String claimId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "POLICY_NUMBER", referencedColumnName = "POLICY_NUMBER")
    private Policy policy;

    @Column(name = "DATE_OF_CLAIM")
    private LocalDate dateOfClaim;

    @Column(name = "CLAIM_AMOUNT")
    private BigDecimal claimAmount;

    public Claim() {
    }

    public String getClaimId() {
        return claimId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public LocalDate getDateOfClaim() {
        return dateOfClaim;
    }

    public void setDateOfClaim(LocalDate dateOfClaim) {
        this.dateOfClaim = dateOfClaim;
    }

    public BigDecimal getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(BigDecimal claimAmount) {
        this.claimAmount = claimAmount;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Claim claim = (Claim) o;
        return Objects.equals(claimId, claim.claimId) && Objects.equals(policy, claim.policy) && Objects.equals(dateOfClaim, claim.dateOfClaim) && Objects.equals(claimAmount, claim.claimAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(claimId, policy, dateOfClaim, claimAmount);
    }

    @Override
    public String toString() {
        return "Claim{" +
                "claimId='" + claimId + '\'' +
                ", policy=" + policy +
                ", dateOfClaim=" + dateOfClaim +
                ", claimAmount=" + claimAmount +
                '}';
    }
}
