FROM adoptopenjdk/openjdk11:ubi
ADD build/libs/the-retro-0.0.1-SNAPSHOT.jar the-retro.jar
ENTRYPOINT ["sh", "-c", "java -jar /the-retro.jar"]
