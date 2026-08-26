package org.sw.facts;

import java.util.Objects;
public class Payout {
    private String policyNumber;
    private int claimAmount;

    public Payout(String policyNumber, int claimAmount) {
        this.policyNumber = policyNumber;
        this.claimAmount = claimAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public int getClaimAmount() {
        return claimAmount;
    }

    @Override
    public String toString() {
        return "Payout[to Policy: " + policyNumber + ", in amount: " + claimAmount + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payout payout = (Payout) o;
        return Objects.equals(policyNumber, payout.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

}
