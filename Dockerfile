FROM openjdk:8
COPY ./target/SPE_Mini_Project-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "SPE_Mini_Project-1.0-SNAPSHOT-jar-with-dependencies.jar"]
