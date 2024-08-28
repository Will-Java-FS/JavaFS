# Stage 1: Build the applicaiton
FROM maven:3.8.4-openjdk-17-slim AS build

# Setup a working directory. This means everything we create on the Docker 
# side moving forward will be in this assumed location.
WORKDIR /app

# We could our pom.xml to help facilitate which dependencies need to be installed.
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy over our project's src code.
COPY src ./src

# Build the application
RUN mvn package -DskipTests


# Stage 2: Running the Application
FROM eclipse-temurin:17-jdk AS run

# Also set this new Stage's working directory
WORKDIR /app

# Bring over the JAR file from the build Stage.
#COPY --from=build /app/target/SpringMVC-0.0.1-SNAPSHOT.jar ./app.jar
COPY --from=build /app/target/JavaApp-1.0-SNAPSHOT.jar ./app.jar


# Tell Docker to use port 8080
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]