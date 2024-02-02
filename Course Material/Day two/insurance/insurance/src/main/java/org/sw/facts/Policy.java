package org.sw.facts;

import java.util.Objects;

public class Policy {
    private String policyNumber;
    private String clientName;
    private int premium;
    private int coverage;
    private String paymentStatus;
    private Status status = Status.VALID;
    private String reason = "";

    // Getters
    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public int getPremium() {
        return premium;
    }

    public int getCoverage() {
        return coverage;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public Status getStatus() {
        return status;
    }



    public String getReason() {
        return reason;
    }

    // Setters
    public void setPolicyNumber(String policyNumber) {this.policyNumber = policyNumber; }
    public void setClientName(String clientName) { this.clientName = clientName; }
    public void setPremium(int premium) {
        this.premium = premium;
    }

    public void setCoverage(int coverage) { this.coverage = coverage; }

    public void setPaymentStatus(String paymentStatus) { this.paymentStatus = paymentStatus; }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return String.format("Policy [Policy #%s, %s]", policyNumber, clientName);
    }

    public static PolicyBuilder newBuilder() {
        return new PolicyBuilder();
    }

    public static final class PolicyBuilder {
        private String policyNumber;
        private String clientName;
        private int premium;
        private int coverage;
        private String paymentStatus;

        private PolicyBuilder() {
        }

        public PolicyBuilder withPolicyNumber(String policyNumber) {
            this.policyNumber = policyNumber;
            return this;
        }

        public PolicyBuilder withClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }

        public PolicyBuilder withPremium(int premium) {
            this.premium = premium;
            return this;
        }

        public PolicyBuilder withCoverage(int coverage) {
            this.coverage = coverage;
            return this;
        }

        public PolicyBuilder withPaymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }

        public Policy build() {
            Policy policy = new Policy();
            policy.policyNumber = this.policyNumber;
            policy.clientName = this.clientName;
            policy.premium = this.premium;
            policy.coverage = this.coverage;
            policy.paymentStatus = this.paymentStatus;
            return policy;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Policy policy = (Policy) o;
        return Objects.equals(policyNumber, policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }
}
