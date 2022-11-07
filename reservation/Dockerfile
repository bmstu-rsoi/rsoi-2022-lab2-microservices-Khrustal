FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} reservation.jar
ENTRYPOINT ["java","-jar","./reservation.jar"]