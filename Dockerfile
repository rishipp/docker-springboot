FROM openjdk:11-jdk AS build
WORKDIR /workspace/app
COPY . /workspace/app
RUN ./gradlew build --info

FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine
WORKDIR /opt/app
COPY --from=build /workspace/app/build/libs/*.jar /opt/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "/opt/app.jar"]