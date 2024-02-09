package org.sw.facts;

public class ValidApplication {
    private Application application;

    public ValidApplication(Application application) {
        this.application = application;
    }

    public Application getApplication() {
        return application;
    }

    @Override
    public String toString() {
        return "Valid:" + application;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ValidApplication
                && ((ValidApplication) obj).getApplication().equals(application);
    }

    @Override
    public int hashCode() {
        return application.hashCode();
    }

}
