# Use the official OpenJDK image as the base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the target directory to the working directory inside the container
COPY target/in-memory-rate-limiting-0.0.1-SNAPSHOT.jar /app/in-memory-rate-limiting.jar

# Expose port 8080 to the outside world
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "/app/in-memory-rate-limiting.jar"]
