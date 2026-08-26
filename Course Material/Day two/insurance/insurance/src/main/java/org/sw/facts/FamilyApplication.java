package org.sw.facts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FamilyApplication {
    private final String applicationNumber;
    private List<String> clientIdNumbers = new ArrayList<>();
    private List<Integer> clientAges = new ArrayList<>();
    private LocalDate startDate;
    private int policyDurationYears;

    public FamilyApplication(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public String getApplicationNumber() {
        return applicationNumber;
    }

    public List<String> getClientIdNumbers() {
        return clientIdNumbers;
    }

    public List<Integer> getClientAges() { return clientAges; }

    public LocalDate getStartDate() {
        return startDate;
    }

    public int getPolicyDurationYears() {
        return policyDurationYears;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setPolicyDurationYears(int policyDurationYears) {
        this.policyDurationYears = policyDurationYears;
    }

    public static String join(Collection<String> collection) {
        return collection.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }

    @Override
    public String toString() {
        return String.format("FamilyApplication[Number:%s, Clients:%s]", applicationNumber, join(clientIdNumbers));
    }

    public static FamilyApplicationBuilder newBuilder() {
        return new FamilyApplicationBuilder();
    }

    public static final class FamilyApplicationBuilder {
        private String applicationNumber;
        private List<String> clientIdNumbers = new ArrayList<>();
        private List<Integer> clientAges = new ArrayList<>();
        private LocalDate startDate;
        private int policyDurationYears;

        private FamilyApplicationBuilder() {
        }

        public FamilyApplicationBuilder withApplicationNumber(String applicationNumber) {
            this.applicationNumber = applicationNumber;
            return this;
        }

        public FamilyApplicationBuilder withClientIdNumbers(List<String> clientIdNumbers) {
            this.clientIdNumbers = clientIdNumbers;
            return this;
        }

        public FamilyApplicationBuilder withClientAges(List<Integer> clientAges) {
            this.clientAges = clientAges;
            return this;
        }

        public FamilyApplicationBuilder withStartDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        public FamilyApplicationBuilder withPolicyDurationYears(int policyDurationYears) {
            this.policyDurationYears = policyDurationYears;
            return this;
        }

        public FamilyApplication build() {
            FamilyApplication familyApplication = new FamilyApplication(applicationNumber);
            familyApplication.clientIdNumbers = this.clientIdNumbers;
            familyApplication.clientAges = this.clientAges;
            familyApplication.startDate = this.startDate;
            familyApplication.policyDurationYears = this.policyDurationYears;
            return familyApplication;
        }
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof FamilyApplication
                && ((FamilyApplication) obj).getApplicationNumber().equals(applicationNumber);
    }

    @Override
    public int hashCode() {
        return applicationNumber.hashCode();
    }

}
