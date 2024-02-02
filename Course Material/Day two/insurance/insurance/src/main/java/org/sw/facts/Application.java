package org.sw.facts;

import java.util.Objects;

public class Application {
    private String applicationNumber;
    private String clientName;
    private String clientIdNumber;
    private boolean PEC;
    private String risk;
    private boolean employed;
    private boolean isSmoker;
    private int clientAge;
    private int BMI;
    private Status status = Status.PENDING;
    private String reason = "";

    // Getters
    public String getApplicationNumber() {
        return applicationNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientIdNumber() {
        return clientIdNumber;
    }

    public boolean getPEC() {
        return PEC;
    }

    public String getRisk() {
        return risk;
    }

    public boolean getEmployed() {
        return employed;
    }

    public boolean isSmoker() {
        return isSmoker;
    }

    public int getClientAge() {
        return clientAge;
    }

    public int getBMI() {
        return BMI;
    }

    public Status getStatus() {
        return status;
    }

    public String getReason() {
        return reason;
    }

    // Setters
    public void setStatus(Status status) {
        this.status = status;
    }

    public void setAge(int clientAge) {
        this.clientAge = clientAge;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return String.format("Application [#%s, name:%s]", applicationNumber, clientName);
    }

    public static ApplicationBuilder newBuilder() {
        return new ApplicationBuilder();
    }

    public static final class ApplicationBuilder {
        private String applicationNumber;
        private String clientName;
        private String clientIdNumber;
        private boolean PEC;
        private String risk;
        private boolean employed;
        private boolean isSmoker;
        private int clientAge;
        private int BMI;

        private ApplicationBuilder() {
        }

        public ApplicationBuilder withApplicationNumber(String applicationNumber) {
            this.applicationNumber = applicationNumber;
            return this;
        }

        public ApplicationBuilder withClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }

        public ApplicationBuilder withClientIdNumber(String clientIdNumber) {
            this.clientIdNumber = clientIdNumber;
            return this;
        }

        public ApplicationBuilder withPEC(boolean PEC) {
            this.PEC = PEC;
            return this;
        }

        public ApplicationBuilder withRisk(String risk) {
            this.risk = risk;
            return this;
        }

        public ApplicationBuilder withEmployed(boolean employed) {
            this.employed = employed;
            return this;
        }

        public ApplicationBuilder withSmoker(boolean isSmoker) {
            this.isSmoker = isSmoker;
            return this;
        }

        public ApplicationBuilder withClientAge(int clientAge) {
            this.clientAge = clientAge;
            return this;
        }

        public ApplicationBuilder withBMI(int BMI) {
            this.BMI = BMI;
            return this;
        }

        public Application build() {
            Application application = new Application();
            application.applicationNumber = this.applicationNumber;
            application.clientName = this.clientName;
            application.clientIdNumber = this.clientIdNumber;
            application.PEC = this.PEC;
            application.risk = this.risk;
            application.employed = this.employed;
            application.isSmoker = this.isSmoker;
            application.clientAge = this.clientAge;
            application.BMI = this.BMI;
            return application;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Application application = (Application) o;
        return Objects.equals(applicationNumber, application.applicationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationNumber);
    }

}
