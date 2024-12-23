FROM eclipse-temurin:17-jdk-focal

COPY target/myproject-0.0.1-SNAPSHOT.jar myproject-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/myproject-0.0.1-SNAPSHOT.jar"]