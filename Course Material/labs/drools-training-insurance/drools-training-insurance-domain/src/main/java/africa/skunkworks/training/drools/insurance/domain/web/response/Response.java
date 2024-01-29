package africa.skunkworks.training.drools.insurance.domain.web.response;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Response<T> implements Serializable {
    @Serial
    private static final long serialVersionUID = -851431917019354753L;

    private boolean isSuccessful;

    private String message;

    private transient T payload;

    public Response() {
    }

    public Response(boolean isSuccessful, String message) {
        this.isSuccessful = isSuccessful;
        this.message = message;
    }

    public Response(boolean isSuccessful, String message, T payload) {
        this(isSuccessful,message);
        this.payload = payload;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public void setSuccessful(boolean successful) {
        isSuccessful = successful;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response<?> response = (Response<?>) o;
        return isSuccessful == response.isSuccessful && Objects.equals(message, response.message) && Objects.equals(payload, response.payload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccessful, message, payload);
    }

    @Override
    public String toString() {
        return "Response{" +
                "isSuccessful=" + isSuccessful +
                ", message='" + message + '\'' +
                ", payload=" + payload +
                '}';
    }
}
