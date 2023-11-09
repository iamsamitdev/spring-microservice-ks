# Use official base image of Java Runtime
FROM arm64v8/openjdk:17-slim

# Who is MAINTAINER
MAINTAINER Samit Koyom, samit@gmail.com

# Copy jar file to container
COPY ./target/config-0.0.1-SNAPSHOT.jar config.jar

# Set port
EXPOSE 9002

# Run the JAR file
ENTRYPOINT ["java","-jar","/config.jar"]