FROM gradle:8.3.0-jdk17 AS builder

WORKDIR /app
COPY build.gradle.kts settings.gradle.kts /app/
COPY src /app/src
RUN gradle clean build



FROM amazoncorretto:17

WORKDIR /app
COPY --from=builder /app/build/libs/expense-service.jar .

EXPOSE 8080
CMD ["java", "-jar", "expense-service.jar"]
