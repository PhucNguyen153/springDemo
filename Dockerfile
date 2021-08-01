FROM openjdk:8u141-jre
ADD target/quanli-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT exec java -jar app.jar