FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY demo-springboot-0.0.1-SNAPSHOT.jar demo-springboot-0.0.1-SNAPSHOT.jar
EXPOSE 8081
CMD java -jar demo-springboot-0.0.1-SNAPSHOT.jar