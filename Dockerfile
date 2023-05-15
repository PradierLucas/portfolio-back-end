FROM amazoncorretto:17
MAINTAINER lucas
COPY target/SpringBoot-0.0.1-SNAPSHOT  porfolio-app.jar
ENTRYPOINT ["java","-jar","/porfolio-app.jar"]
