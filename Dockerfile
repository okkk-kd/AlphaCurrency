FROM openjdk:17

EXPOSE 80

COPY AlphaCurrency-0.0.1-SNAPSHOT-all.jar AlphaCurrency.jar

CMD ["java", "-jar", "AlphaCurrency.jar"]
