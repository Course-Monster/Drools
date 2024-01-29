INSERT INTO QUANKEE_ENGINE_CONFIG.PROPERTIES (key,value, application, profile, label,version, state)
VALUES ('spring.cloud.gateway.routes[0].id','drools-training-insurance','drools-training-gateway','dev','latest', 'latest','ENABLED'),
	  ('spring.cloud.gateway.routes[0].uri','lb://QUANKEE-ENGINE-NOTIFICATION','drools-training-gateway','dev','latest', 'latest','ENABLED'),
      ('spring.cloud.gateway.routes[0].predicates[0]','Path=/engine/notification/**','drools-training-gateway','dev','latest', 'latest','ENABLED'),
      ('eureka.client.serviceUrl.defaultZone','http://drools-training-eureka:8761/eureka','drools-training-insurance','dev','latest', 'latest','ENABLED'),
      ('eureka.client.register-with-eureka','true','drools-training-insurance','dev','latest', 'latest','ENABLED'),
	  ('eureka.client.fetch-registry','true','drools-training-insurance','dev','latest', 'latest','ENABLED'),
      ('eureka.client.tls.enabled','false','drools-training-insurance','dev','latest', 'latest','ENABLED'),
      ('eureka.instance.prefer-ip-address','true','drools-training-insurance','dev','latest', 'latest','ENABLED'),
      ('spring.datasource.url','jdbc:postgresql://localhost:5432/quankee?','drools-training-insurance','dev','latest', 'latest','ENABLED'),
      ('spring.datasource.driver-class-name','org.postgresql.Driver','drools-training-insurance','dev','latest', 'latest','ENABLED'),
      ('spring.datasource.username','quankee','drools-training-insurance','dev','latest', 'latest','ENABLED'),
      ('spring.datasource.password','quankee','drools-training-insurance','dev','latest', 'latest','ENABLED'),
      ('spring.jpa.hibernate.ddl-auto','update','drools-training-insurance','dev','latest', 'latest','ENABLED'),
      ('spring.jpa.hibernate.naming.physical-strategy','org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl','drools-training-insurance','dev','latest', 'latest','ENABLED'),
      ('spring.jpa.show-sql','true','drools-training-insurance','dev','latest', 'latest','ENABLED');
      