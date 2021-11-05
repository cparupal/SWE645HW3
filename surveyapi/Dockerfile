FROM openjdk:11
EXPOSE 8080
ADD /var/jenkins_home/workspace/API_Pipeline/surveyapi/target/studentsurvey.jar studentsurveyform.jar
ENTRYPOINT ["java","-jar","/studentsurveyform.jar"]
