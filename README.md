# DemoApp

* https://youtu.be/9SGDpanrc8U
* JUnit: https://youtu.be/Geq60OVyBPg?t=1479
* assertj: https://www.baeldung.com/introduction-to-assertj

## Database configs

**PostgreSQL config**
```javascript
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/student
    username:
    password:
  jpa:
    hibernate:
      ddl-auto: 'create-drop'
    show-sql: true
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect
        format_sql: true
```

**MySql config**
```javascript
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/student
    username: root
    password: root1234
  jpa:
    hibernate:
      ddl-auto: 'create-drop'
    show-sql: true
```
Also, replace postgresql dependency with mysql dependency when changing the database
```javascript
<dependency>
  <groupId>mysql</groupId>
  <artifactId>mysql-connector-java</artifactId>
</dependency>
```

## Curl
**Create:**
```javascript
curl --location --request POST 'localhost:8080/api/v1/student/' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Joe Goldberg",
    "email": "joeg@gmail.com",
    "age": 25,
    "dob": "2001-06-20"
}'
```

**Get:**
```javascript
curl --location --request GET 'localhost:8080/api/v1/student/'
```

```javascript
curl --location --request GET 'localhost:8080/api/v1/student/1'
```

**Update:**
```javascript
curl --location --request PUT 'localhost:8080/api/v1/student/2?name=Joe&email=joeg2@gmail.com' \
--header 'Content-Type: application/json' \
--data-raw ''
```

**Delete:**
```javascript
curl --location --request DELETE 'localhost:8080/api/v1/student/1' \
--data-raw ''
```

## Run multiple instances of the app
`cd target`

`java -jar demo-0.0.1-SNAPSHOT.jar` on default port 8080

`java -jar demo-0.0.1-SNAPSHOT.jar --server.port=8081`

`java -jar demo-0.0.1-SNAPSHOT.jar --server.port=8082`


## Using RestTemplate to call other services
* https://howtodoinjava.com/spring-boot2/resttemplate/spring-restful-client-resttemplate-example/
* https://www.baeldung.com/rest-template

## RestTemplate vs WebClinet
* https://www.baeldung.com/spring-webclient-resttemplate
