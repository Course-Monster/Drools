package org.sw.builder;

import org.sw.facts.Policy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PolicyRepository {
    public static List<Policy> getPolicies() {
        List<Policy> policies = new ArrayList<>();

        policies.add(Policy.newBuilder()
                .withPolicyNumber("P-1000")
                .withClientName("John Doe")
                .withPremium(140)
                .withCoverage(14000)
                .withPaymentStatus("Paid")
                .build());

        policies.add(Policy.newBuilder()
                .withPolicyNumber("P-1001")
                .withClientName("Emma Smith")
                .withPremium(220)
                .withCoverage(22000)
                .withPaymentStatus("Unpaid")
                .build());

        policies.add(Policy.newBuilder()
                .withPolicyNumber("P-1002")
                .withClientName("William Johnson")
                .withPremium(150)
                .withCoverage(15000)
                .withPaymentStatus("Unpaid")
                .build());

        policies.add(Policy.newBuilder()
                .withPolicyNumber("P-1003")
                .withClientName("Olivia Brown")
                .withPremium(90)
                .withCoverage(9000)
                .withPaymentStatus("Paid")
                .build());

        policies.add(Policy.newBuilder()
                .withPolicyNumber("P-1004")
                .withClientName("Michael Davis")
                .withPremium(400)
                .withCoverage(40000)
                .withPaymentStatus("Paid")
                .build());

        policies.add(Policy.newBuilder()
                .withPolicyNumber("P-1005")
                .withClientName("Sophia Martinez")
                .withPremium(230)
                .withCoverage(23000)
                .withPaymentStatus("Paid")
                .build());

        policies.add(Policy.newBuilder()
                .withPolicyNumber("P-1006")
                .withClientName("Ethan Wilson")
                .withPremium(180)
                .withCoverage(18000)
                .withPaymentStatus("Paid")
                .build());

        policies.add(Policy.newBuilder()
                .withPolicyNumber("P-1007")
                .withClientName("Isabella Taylor")
                .withPremium(240)
                .withCoverage(24000)
                .withPaymentStatus("Paid")
                .build());

        policies.add(Policy.newBuilder()
                .withPolicyNumber("P-1008")
                .withClientName("Daniel Moore")
                .withPremium(120)
                .withCoverage(12000)
                .withPaymentStatus("Unpaid")
                .build());

        policies.add(Policy.newBuilder()
                .withPolicyNumber("P-1009")
                .withClientName("Ava Thompson")
                .withPremium(210)
                .withCoverage(21000)
                .withPaymentStatus("Unpaid")
                .build());

        return policies;
    }
}
