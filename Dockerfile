FROM maven:latest as build-stage

WORKDIR /app

COPY pom.xml ./

RUN mvn clean install

COPY ./ .

RUN mvn run build


