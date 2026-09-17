FROM maven:3.9.6-eclipse-temurin17 AS build
WORKDIR /app

COPY pom.xml .
COPY src ./src

run mvn clean package -DskipTests

#2 Fase execució
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]