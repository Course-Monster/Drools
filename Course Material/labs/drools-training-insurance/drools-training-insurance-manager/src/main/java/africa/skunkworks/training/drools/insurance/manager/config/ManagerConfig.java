package africa.skunkworks.training.drools.insurance.manager.config;

import africa.skunkworks.training.drools.insurance.service.config.ServiceConfig;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
@Import({ServiceConfig.class})
@ComponentScan({"africa.skunkworks.training.drools.insurance.manager"})
public class ManagerConfig {

    private static final String BASE_NAME = "classpath:i18n/messages";

    private static final String DEFAULT_ENCODING = "UTF-8";

    @Bean
    public LocalValidatorFactoryBean getValidator() {
        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
        bean.setValidationMessageSource(messageSource());
        return bean;
    }

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename(BASE_NAME);
        messageSource.setDefaultEncoding(DEFAULT_ENCODING);
        return messageSource;
    }
}
