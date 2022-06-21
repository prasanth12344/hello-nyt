FROM tomcat:8.0-alpine
ADD target/Hello-world.jar Hello-world.jar
ENTRYPOINT ["sh","-c","java -jar /Hello-world.jar"]

