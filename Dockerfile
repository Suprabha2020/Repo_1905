FROM alpine:3.2
RUN apk --update add openjdk7-jre
CMD ["/usr/bin/java", "-version"]
COPY /target/my-demo-project.jar   /
CMD /usr/bin/java -jar /my-demo-project.jar