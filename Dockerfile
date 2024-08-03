# Use an official Eclipse Temurin image with JDK 17 on Alpine Linux
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the jar file from your host to your container
COPY target/projectone.example.jar projectone.example.jar

# Expose port 8080 for your application
EXPOSE 8080

# Accept environment variables as build arguments
ARG DB_PASSWORD
ARG DB_URL
ARG DB_USERNAME
ARG SPRING_PROFILES_ACTIVE

# Set environment variables from build arguments
ENV DB_PASSWORD=${DB_PASSWORD} \
    DB_URL=${DB_URL} \
    DB_USERNAME=${DB_USERNAME} \
    SPRING_PROFILES_ACTIVE=${SPRING_PROFILES_ACTIVE}

# Command to run the application
CMD ["java","-jar","projectone.example.jar"]
