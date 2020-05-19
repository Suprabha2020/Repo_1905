FROM openjdk:8
ADD target/my-demo-project.jar my-demo-project.jar
ENTRYPOINT ["java","-jar","/my-demo-project.jar"]
EXPOSE 8080