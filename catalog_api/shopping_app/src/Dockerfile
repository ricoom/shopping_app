FROM  maven:3-openjdk-17 AS build
COPY . .
RUN mvn clean package -Diskiptests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/shopping_app-0.0.1-SNAPSHOT.jar shopping_app.jar
EXPOSE 8080
ENTRYPOINT [ "java","-jar", "shopping_app.jar"]