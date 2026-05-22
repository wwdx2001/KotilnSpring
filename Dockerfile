FROM eclipse-temurin:21-jdk-jammy
LABEL "language"="java"
LABEL "framework"="spring-boot"

WORKDIR /src

COPY . .

RUN chmod +x gradlew && ./gradlew build -x test --no-daemon -Dorg.gradle.jvmargs="-Xmx2g"

EXPOSE 8080

CMD ["sh", "-c", "exec java -jar build/libs/*-SNAPSHOT.jar"]