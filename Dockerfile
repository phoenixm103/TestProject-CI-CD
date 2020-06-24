FROM openjdk:8-jdk-alpine
EXPOSE 6088
WORKDIR /app 
//COPY target/testProject.jar .
ENTRYPOINT [ "java", "-jar", "testProject.jar" ]

