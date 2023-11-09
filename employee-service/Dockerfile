# Use official base image of Java Runtime
FROM arm64v8/openjdk:17-slim

# Who is MAINTAINER
MAINTAINER Samit Koyom, samit@gmail.com

# Copy jar file to container
COPY ./target/employee-service-0.0.1-SNAPSHOT.jar employee-service.jar

# Set port
EXPOSE 8081

# Run the JAR file
ENTRYPOINT ["java","-jar","/employee-service.jar"]