FROM eclipse-temurin:21-jre

COPY ./api-service/target/api-service-1.0-SNAPSHOT.jar /usr/app/api-service-1.0-SNAPSHOT.jar

WORKDIR /usr/app

EXPOSE 8088

CMD java -jar /usr/app/api-service-1.0-SNAPSHOT.jar