FROM openjdk:11
EXPOSE 8080
ADD target/github-action-workflow-springboot.jar github-action-workflow-springboot.jar
ENTRYPOINT ["java","-jar","/github-action-workflow-springboot.jar"]