FROM openjdk:17-oracle
COPY ./target/authentication-0.0.1-SNAPSHOT.jar authentication.jar
CMD ["java","-jar","authentication.jar"]