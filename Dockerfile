FROM amazoncorretto:21-alpine
ENTRYPOINT ["/usr/bin/web-api-service.sh"]

COPY web-api-service.sh /usr/bin/web-api-service.sh
COPY target/*.jar /usr/share/web-api-service/web-api-service.jar
