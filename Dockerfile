FROM openjdk:17-jdk-slim AS build
WORKDIR /app

# Copy the project files
COPY . .
RUN ./mvnw clean package -DskipTests




FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar", "com.example.demo.DemoApplication"]