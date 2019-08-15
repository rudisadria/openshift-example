FROM openjdk:8-jdk-alpine
#expose port 8080
EXPOSE 8080

#default command
CMD java -jar /apps/openshift.war

#copy hello world to docker image
ADD ./target/openshift.war /apps/openshift.war