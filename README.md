# spring-test-solution

## Overview

This application is developed as per requirement shared for a code test.

Application uses below list of libraries

- Spring boot
- Hibernate & JPA
- MySQL
- JAVA 8 
- Maven

### Application configuration

The application specific configuration should be done at src/main/resources/application.properties


```
spring.datasource.url = jdbc:mysql://localhost:3306/wagawin?useSSL=false
spring.datasource.username = ******
spring.datasource.password = ******
spring.datasource.testWhileIdle = true
spring.datasource.validationQuery = SELECT 1
spring.jpa.show-sql = false
spring.jpa.hibernate.ddl-auto = update
spring.jpa.hibernate.naming-strategy = org.hibernate.cfg.ImprovedNamingStrategy
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
```

Please feel free to update the configuration file as per your configuration

### Build & Run Application

Application can be build using Maven 3. 

```
mvn clean install pom.xml
```

#### Run

Application can be executed with main class com.wagawin.solution.Application.class


