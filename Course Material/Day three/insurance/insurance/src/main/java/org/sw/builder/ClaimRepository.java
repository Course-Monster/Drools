package org.sw.builder;

import org.sw.facts.Claim;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class ClaimRepository {
    public static List<Claim> getClaims() {
        List<Claim> claims = new ArrayList<>();

        claims.add(Claim.newBuilder()
                .withClientName("John Doe")
                .withPolicyNumber("P-1100")
                .withDateOfClaim(LocalDate.of(2022, 5, 19))
                .withClaimAmount(8000)
                .build());

        claims.add(Claim.newBuilder()
                .withClientName("William Johnson")
                .withPolicyNumber("P-1002")
                .withDateOfClaim(LocalDate.of(2020, 4, 14))
                .withClaimAmount(10000)
                .build());

        claims.add(Claim.newBuilder()
                .withClientName("Michael Davis")
                .withPolicyNumber("P-1004")
                .withDateOfClaim(LocalDate.of(2023, 1, 31))
                .withClaimAmount(40000)
                .build());

        claims.add(Claim.newBuilder()
                .withClientName("Sophia Martinez")
                .withPolicyNumber("P-1005")
                .withDateOfClaim(LocalDate.of(2022, 1, 3))
                .withClaimAmount(50000)
                .build());

        claims.add(Claim.newBuilder()
                .withClientName("Ava Thompson")
                .withPolicyNumber("P-1009")
                .withDateOfClaim(LocalDate.of(2022, 2, 8))
                .withClaimAmount(25000)
                .build());

        return claims;
    }
}
