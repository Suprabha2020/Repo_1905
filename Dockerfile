FROM java:8-jdk-alpine
RUN apk --update add openjdk7-jre
COPY /target/my-demo-project.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java", “-jar", “my-demo-project.jar"]
