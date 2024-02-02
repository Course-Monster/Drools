package org.sw.facts;

import java.util.Collection;

public class SessionData {
    public Collection<Application> applications;
    public Collection<Policy> policies;
    public Collection<ClientID> clientIDs;
    public Collection<Claim> claims;
    public Collection<FamilyApplication> familyApplications;
    // Add other collections as necessary

    // If you have valid and invalid versions of each, you can add those collections too
    public Collection<ValidApplication> validApplications;
    public Collection<InvalidApplication> invalidApplications;
    public Collection<ValidClientID> validClientIDs;
    public Collection<InvalidClientID> invalidClientIDs;
    public Collection<ValidClaim> validClaims;
    public Collection<InvalidClaim> invalidClaims;
    public Collection<InvalidFamilyApplication> invalidFamilyApplications;
}
