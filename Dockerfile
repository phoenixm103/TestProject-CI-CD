FROM openjdk:8-jdk-alpine
EXPOSE 6088
WORKDIR /app 
ENTRYPOINT [ "java", "-jar", "testProject.jar" ]

