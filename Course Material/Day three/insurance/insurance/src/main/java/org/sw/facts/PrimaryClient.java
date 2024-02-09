package org.sw.facts;

public class PrimaryClient {
    private ClientID clientID;
    private FamilyApplication familyApplication;

    public PrimaryClient(ClientID clientID, FamilyApplication familyApplication) {
        this.clientID = clientID;
        this.familyApplication = familyApplication;
    }

    public ClientID getClientID() {
        return clientID;
    }

    @Override
    public String toString() {
        return "Application #"+ familyApplication.getApplicationNumber() + " Primary Cleint: " + clientID.getName();
    }
}
