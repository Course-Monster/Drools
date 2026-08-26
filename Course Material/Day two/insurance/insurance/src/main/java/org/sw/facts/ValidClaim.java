package org.sw.facts;

public class ValidClaim {
    private Claim claim;

    public ValidClaim(Claim claim) {
        this.claim = claim;
    }

    public Claim getClaim() {
        return claim;
    }

    @Override
    public String toString() {
        return "Valid:" + claim;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ValidClaim
                && ((ValidClaim) obj).getClaim().equals(claim);
    }

    @Override
    public int hashCode() {
        return claim.hashCode();
    }

}
