FROM openjdk:8-jdk-alpine
EXPOSE 8081
ADD build/libs/Conditional1-0.0.1-SNAPSHOT.jar.jar myapp.jar
ENTRYPOINT ["java","-jar","/myapp.jar"]