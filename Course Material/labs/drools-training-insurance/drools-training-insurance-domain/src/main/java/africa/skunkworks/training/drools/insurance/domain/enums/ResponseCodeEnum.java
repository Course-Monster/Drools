package africa.skunkworks.training.drools.insurance.domain.enums;

public enum ResponseCodeEnum {

    SUCCESS("SUCCESS"),
    CREATED("CREATED"),
    UPDATED("UPDATED"),
    DELETED("DELETED"),
    FAILURE("FAILURE"),
    LISTED("LISTED");

    private final String value;

    ResponseCodeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
