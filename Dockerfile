## ./gradlew jibDockerBuild --image=yvangak/the-retro
## docker run -p 8080:8080 -t yvangak/the-retro
FROM adoptopenjdk/openjdk11:ubi
EXPOSE 8080
ADD build/libs/the-retro-0.0.1-SNAPSHOT.jar the-retro.jar
ENTRYPOINT ["sh", "-c", "java -jar /the-retro.jar"]
