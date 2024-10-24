FROM openjdk:17-oracle

EXPOSE 8082

ADD target/docker-demo-client.jar /docker-demo-client.jar

ENTRYPOINT ["java","-jar","docker-demo-client.jar"]