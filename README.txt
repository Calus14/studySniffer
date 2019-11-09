This application is meant to ingest studies in an aggreed Study Dto object, process them via NLP to build information
that can be usefull to find truth data and other correlations. Store them into a database for further use, and return
said Summaries as well as other metadata for anyone that calls into it.

BUILDING
gradlew is included in the project so a simple
gradlew clean build

RUNNING
gradlew bootRun

Trouble shooting.
Read SQL Trouble shooting. Make sure no other program is running on port 8081. Configure the application properties if you want to set a different property
Make sure that you have a database named studysniffer running on 5432 and postgres started
If you do change your sql port number make sure to change it in application.properties.

Read the runtime failure if it still doesnt start correctly and post in the slack.

