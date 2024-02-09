package org.sw.facts;

public class InvalidFamilyApplication {
    private FamilyApplication familyApplication;

    public InvalidFamilyApplication(FamilyApplication familyApplication) {
        this.familyApplication = familyApplication;
    }

    public FamilyApplication getFamilyApplication() {
        return familyApplication;
    }

    @Override
    public String toString() {
        return "Invalid:" + familyApplication;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InvalidFamilyApplication that = (InvalidFamilyApplication) obj;
        return familyApplication != null ? familyApplication.equals(that.familyApplication) : that.familyApplication == null;
    }

    @Override
    public int hashCode() {
        return familyApplication != null ? familyApplication.hashCode() : 0;
    }

}
