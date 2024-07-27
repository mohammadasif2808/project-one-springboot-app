FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/projectone.example.jar projectone.example.jar
EXPOSE 8080
CMD ["java","-jar","projectone.example.jar"]