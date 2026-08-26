package org.sw.facts;

import java.time.LocalDate;
import java.util.Objects;

public class Claim {
    private String clientName;
    private String policyNumber;
    private LocalDate dateOfClaim;
    private int claimAmount;
    private Status status = Status.PENDING;
    private String reason = "";

    // Getters
    public String getClientName() {
        return clientName;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public LocalDate getDateOfClaim() {
        return dateOfClaim;
    }

    public int getClaimAmount() {
        return claimAmount;
    }

    public Status getStatus() {
        return status;
    }

    public String getReason() {
        return reason;
    }

    // Setters
    public void setClaimAmount(int claimAmount) { this.claimAmount = claimAmount; }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return String.format("Claim [name:%s, amount:%s]", clientName, claimAmount);
    }

    public static ClaimBuilder newBuilder() {
        return new ClaimBuilder();
    }

    public static final class ClaimBuilder {
        private String clientName;
        private String policyNumber;
        private LocalDate dateOfClaim;
        private int claimAmount;

        private ClaimBuilder() {
        }

        public ClaimBuilder withClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }

        public ClaimBuilder withPolicyNumber(String policyNumber) {
            this.policyNumber = policyNumber;
            return this;
        }

        public ClaimBuilder withDateOfClaim(LocalDate dateOfClaim) {
            this.dateOfClaim = dateOfClaim;
            return this;
        }

        public ClaimBuilder withClaimAmount(int claimAmount) {
            this.claimAmount = claimAmount;
            return this;
        }

        public Claim build() {
            Claim claim = new Claim();
            claim.clientName = this.clientName;
            claim.policyNumber = this.policyNumber;
            claim.dateOfClaim = this.dateOfClaim;
            claim.claimAmount = this.claimAmount;
            return claim;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Claim claim = (Claim) o;
        return Objects.equals(policyNumber, claim.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

}
