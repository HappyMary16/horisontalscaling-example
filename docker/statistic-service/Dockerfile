FROM eclipse-temurin:21-jre

COPY ./statistic-service/target/statistic-service-1.0-SNAPSHOT.jar /usr/app/statistic-service-1.0-SNAPSHOT.jar

WORKDIR /usr/app

EXPOSE 8085

CMD java -jar /usr/app/statistic-service-1.0-SNAPSHOT.jar