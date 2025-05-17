FROM maven:3.9.9-amazoncorretto-17 AS build
WORKDIR /build
COPY pom.xml .
RUN mvn dependency:resolve
COPY src ./src
RUN mvn clean install -DskipTests

FROM amazoncorretto:17-alpine-jdk
ENV PORT=8080
WORKDIR /app
COPY --from=build /build/target/*.jar /app/encurtador-url.jar

ENTRYPOINT [ "java", "-jar", "/app/encurtador-url.jar","--server.port=${PORT}"]

EXPOSE ${PORT}