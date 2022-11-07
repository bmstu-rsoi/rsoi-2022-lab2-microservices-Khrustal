FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} rating.jar
ENTRYPOINT ["java","-jar","./rating.jar"]