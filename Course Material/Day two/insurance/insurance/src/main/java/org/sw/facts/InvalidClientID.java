package org.sw.facts;

public class InvalidClientID {
    private ClientID clientID;

    public InvalidClientID(ClientID clientID) {
        this.clientID = clientID;
    }

    public ClientID getClientID() {
        return clientID;
    }

    @Override
    public String toString() {
        return "Invalid:" + clientID;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof InvalidClientID
                && ((InvalidClientID) obj).getClientID().equals(clientID);
    }

    @Override
    public int hashCode() {
        return clientID.hashCode();
    }
}
