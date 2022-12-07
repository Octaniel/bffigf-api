FROM maven:3.8.4-openjdk-17 AS build
COPY . .
RUN mvn clean package -Pprod -DskipTests

FROM openjdk:17-jdk-slim
EXPOSE 8080
COPY --from=build /target/bff-igf.jar bff-igf.jar
ENTRYPOINT ["java", "-jar", "bff-igf.jar"]

