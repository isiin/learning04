FROM amazoncorretto:17

RUN set -eu && \
yum upgrade -y && \
yum install -y git tar unzip curl vim tmux procps && \
:

RUN set -eu && \
curl -s https://start.spring.io/starter.zip \
-d javaVersion=17 \
-d packaging=jar \
-d type=gradle-project \
-d dependencies=web,devtools,lombok,thymeleaf,jdbc,mariadb,mybatis \
-d applicationName=DemoApplication \
-d artifactId=demo \
-d description=demo \
-d packageName=com.example.demo \
-o /tmp/app.zip && \
unzip /tmp/app.zip -d /app && \
rm /tmp/app.zip 

WORKDIR /app
COPY application.yml /app/

RUN set -eu && \
rm /app/src/main/resources/application.properties && \
/app/gradlew tasks
