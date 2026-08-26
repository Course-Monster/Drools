package org.sw.facts;

import java.time.LocalDate;
import java.util.Objects;

public class ClientID {
    private String name;
    private String idNumber;
    private LocalDate expiryDate;
    private Status status = Status.UNKNOWN;
    private String reason = "";

    // Getters
    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public Status getStatus() {
        return status;
    }

    public String getReason() {
        return reason;
    }

    // Setters
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public boolean isExpired() {
        return expiryDate.isBefore(LocalDate.now());
    }

    @Override
    public String toString() {
        return String.format("ID: [%s, #:%s]", name, idNumber);
    }

    public static ClientIDBuilder newBuilder() {
        return new ClientIDBuilder();
    }

    public static final class ClientIDBuilder {
        private String name;
        private String idNumber;
        private LocalDate expiryDate;

        private ClientIDBuilder() {
        }

        public ClientIDBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ClientIDBuilder withIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }

        public ClientIDBuilder withExpiryDate(LocalDate expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        public ClientID build() {
            ClientID clientID = new ClientID();
            clientID.name = this.name;
            clientID.idNumber = this.idNumber;
            clientID.expiryDate = this.expiryDate;
            return clientID;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientID clientID = (ClientID) o;
        return Objects.equals(idNumber, clientID.idNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNumber);
    }
}
