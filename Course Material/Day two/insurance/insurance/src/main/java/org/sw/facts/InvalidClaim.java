package org.sw.facts;

public class InvalidClaim {
    private Claim claim;

    public InvalidClaim(Claim claim) {
        this.claim = claim;
    }

    public Claim getClaim() {
        return claim;
    }

    @Override
    public String toString() {
        return "Invalid:" + claim;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof InvalidClaim
                && ((InvalidClaim) obj).getClaim().equals(claim);
    }

    @Override
    public int hashCode() {
        return claim.hashCode();
    }
}
