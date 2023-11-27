FROM openjdk:17
EXPOSE 8181/tcp
COPY ./target/ms-client-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]