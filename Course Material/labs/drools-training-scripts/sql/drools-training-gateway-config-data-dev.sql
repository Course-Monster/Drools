INSERT INTO DROOLS_TRAINING_CONFIG.PROPERTIES (key,value, application, profile, label,version, state)
VALUES ('eureka.client.serviceUrl.defaultZone','http://drools-training-eureka:8761/eureka','drools-training-gateway','dev','latest', 'latest','ENABLED'),
        ('eureka.client.register-with-eureka','true','drools-training-gateway','dev','latest', 'latest','ENABLED'),
		('eureka.client.fetch-registry','true','drools-training-gateway','dev','latest', 'latest','ENABLED'),
        ('eureka.client.tls.enabled','false','drools-training-gateway','dev','latest', 'latest','ENABLED'),
        ('eureka.instance.prefer-ip-address','true','drools-training-gateway','dev','latest', 'latest','ENABLED'),
        ('spring.cloud.gateway.discovery.locator.enabled','true','drools-training-gateway','dev','latest', 'latest','ENABLED'),
        ('management.endpoints.web.exposure.include','gateway','drools-training-gateway','dev','latest', 'latest','ENABLED'),
        ('management.endpoint.gateway.enabled','true','drools-training-gateway','dev','latest', 'latest','ENABLED'),
        ('spring.cloud.gateway.globalcors.corsConfigurations.[/**].allowedOrigins','*','drools-training-gateway','dev','latest', 'latest','ENABLED'),
        ('spring.cloud.gateway.globalcors.corsConfigurations.[/**].allowedHeaders','*','drools-training-gateway','dev','latest', 'latest','ENABLED'),
        ('spring.cloud.gateway.globalcors.corsConfigurations.[/**].allowedMethods','GET, POST, PUT, DELETE, OPTIONS','drools-training-gateway','dev','latest', 'latest','ENABLED');