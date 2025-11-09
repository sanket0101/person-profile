FROM eclipse-temurin:8-jre-alpine

# Optional: install bash if needed
RUN apk update && apk add --no-cache bash

RUN mkdir -p /opt/app
ENV PROJECT_HOME=/opt/app

COPY target/user-profile-service-1.0.0.jar $PROJECT_HOME/user-profile-service-1.0.0.jar

WORKDIR $PROJECT_HOME
EXPOSE 8080

CMD ["java","-jar","user-profile-service-1.0.0.jar"]
