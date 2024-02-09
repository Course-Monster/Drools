package org.sw.facts;

public class InvalidApplication {
    private Application application;

    public InvalidApplication(Application application) {
        this.application = application;
    }

    public Application getApplication() {
        return application;
    }

    @Override
    public String toString() {
        return "Invalid:" + application;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof InvalidApplication
                && ((InvalidApplication) obj).getApplication().equals(application);
    }

    @Override
    public int hashCode() {
        return application.hashCode();
    }

}
