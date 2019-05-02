FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/RestApp-0.0.1-SNAPSHOT.jar /target/RestApp-0.0.1-SNAPSHOT.jar
CMD [“java”,”-Djava.security.egd=file:/dev/./urandom”,”-jar”,”/RestApp-0.0.1-SNAPSHOT.jar”]