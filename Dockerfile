FROM openjdk:8-jdk-alpine
ADD target/Hello-world.jar Hello-world.jar
ENTRYPOINT ["sh","-c","java -jar /Hello-world.jar"]
EXPOSE 8083
