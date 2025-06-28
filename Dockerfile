FROM openjdk:21-ea

WORKDIR /app

COPY build/libs/order-0.0.1-SNAPSHOT.jar order.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar","order.jar"]