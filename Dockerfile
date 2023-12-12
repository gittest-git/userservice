FROM openjdk:21
EXPOSE 8081
ADD target/userservice-image.jar userservice-image.jar
ENTRYPOINT ["java","-jar","/userservice-image.jar"]