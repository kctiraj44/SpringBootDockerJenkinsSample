FROM openjdk:8

EXPOSE 8080

ADD target/springbootjenkins.jar springbootjenkins.jar

ENTRYPOINT["java","-jar","/springbootjenkins.jar"]