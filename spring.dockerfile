FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY apirest-0.0.1-SNAPSHOT.jar /apirest-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/apirest-0.0.1-SNAPSHOT.jar"]