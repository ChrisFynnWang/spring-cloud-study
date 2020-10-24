FROM registry-vpc.cn-hangzhou.aliyuncs.com/ejiayou-other/alpine-oraclejdk8:slim
ADD target/*.jar sign.jar
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /sign.jar