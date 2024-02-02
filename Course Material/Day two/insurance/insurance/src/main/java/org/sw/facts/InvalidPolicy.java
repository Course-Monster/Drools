package org.sw.facts;

public class InvalidPolicy {
    private Policy policy;

    public InvalidPolicy(Policy policy) {
        this.policy = policy;
    }

    public Policy getPolicy() {
        return policy;
    }

    @Override
    public String toString() {
        return "Invalid:" + policy;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        InvalidPolicy that = (InvalidPolicy) obj;
        return policy != null ? policy.equals(that.policy) : that.policy == null;
    }

    @Override
    public int hashCode() {
        return policy != null ? policy.hashCode() : 0;
    }
}
