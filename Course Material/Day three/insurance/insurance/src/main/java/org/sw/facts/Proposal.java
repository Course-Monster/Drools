package org.sw.facts;

import java.util.Objects;

public class Proposal {
    private String applicationNumber;
    private int premium;

    public Proposal(String applicationNumber, int premium) {
        this.applicationNumber = applicationNumber;
        this.premium = premium;
    }

    // Getters
    public String getApplicationNumber() { return applicationNumber; }
    public int getPremium() { return premium; }

    @Override
    public String toString() {
        return "Proposal[to Application: " + applicationNumber + ", with final premium: " + premium + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proposal proposal = (Proposal) o;
        return Objects.equals(applicationNumber, proposal.applicationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationNumber);
    }

}
