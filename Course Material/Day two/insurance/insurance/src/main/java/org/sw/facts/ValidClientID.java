package org.sw.facts;

public class ValidClientID {
    private ClientID clientID;

    public ValidClientID(ClientID clientID) {
        this.clientID = clientID;
    }

    public ClientID getClientID() {
        return clientID;
    }

    @Override
    public String toString() {
        return "Valid:" + clientID;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ValidClientID
                && ((ValidClientID) obj).getClientID().equals(clientID);
    }

    @Override
    public int hashCode() {
        return clientID.hashCode();
    }

}
