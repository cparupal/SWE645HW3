FROM openjdk:11
EXPOSE 8080
ADD /var/lib/docker/volumes/jenkins-data/_data/workspace/API_Pipeline/surveyapi/target/studentsurvey.jar studentsurveyform.jar
ENTRYPOINT ["java","-jar","/studentsurveyform.jar"]
