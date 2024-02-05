package africa.skunkworks.training.drools.insurance.manager;

import org.springframework.context.MessageSource;

import java.util.Locale;

public abstract class AbstractMessageSourceManager {

    private static final Locale DEFAULT_LOCALE = new Locale("en", "ZA");

    private final MessageSource messageSource;

    protected AbstractMessageSourceManager(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    protected String getMessage(String code){
        return getMessage(code, null, DEFAULT_LOCALE);
    }

    protected String getMessage(String code, Object[]args){
        return getMessage(code, args, DEFAULT_LOCALE);
    }

    protected String getMessage(String code, Object[]args, Locale locale){
        return messageSource.getMessage(code, args, locale);
    }
}
