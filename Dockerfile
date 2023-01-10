FROM openjdk:11-slim as build

LABEL maintainer = "MarlvizW hello@marlvizw.me"

COPY target/dreamhub-0.0.1-SNAPSHOT.jar app.jar

ADD https://github.com/ufoscout/docker-compose-wait/releases/download/2.9.0/wait /wait
RUN chmod +x /wait

ADD app.sh /app.sh
RUN chmod +x /app.sh

CMD ["/app.sh"]