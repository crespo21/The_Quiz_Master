FROM openjdk:8-jdk-alpine
MAINTAINER com.QuizMaster
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=build/libs/QuizMaster-0.0.1-SNAPSHOT.jar
ADD $ {JAR_FILE } QuizMaster.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/QuizMaster.jar"]