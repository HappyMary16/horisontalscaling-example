FROM eclipse-temurin:21-jre

COPY ./cat-service/target/cat-service-1.0-SNAPSHOT.jar /usr/app/cat-service-1.0-SNAPSHOT.jar

WORKDIR /usr/app

EXPOSE 8090

CMD java -jar /usr/app/cat-service-1.0-SNAPSHOT.jar