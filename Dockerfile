From java:8

EXPOSE 8080

ADD target/spring-boot-rest-api.jar spring-boot-rest-api.jar

ENTRYPOINT ["java", "-jar", "spring-boot-rest-api.jar"]

