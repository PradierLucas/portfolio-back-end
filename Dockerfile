FROM amazoncorretto:17
MAINTAINER lucas
COPY target/SpringBoot-0.0.1-SNAPSHOT  SpringBoot-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/SpringBoot-0.0.1-SNAPSHOT.jar"]
