## ./gradlew jibDockerBuild --image=yvangak/the-retro
## docker run -p 8080:8080 -t yvangak/the-retro
FROM adoptopenjdk/openjdk11:ubi
EXPOSE 8080
ADD build/libs/*.jar app.jar
ENTRYPOINT ["sh", "-c", "java -jar /app.jar"]
