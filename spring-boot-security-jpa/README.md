This is a starter kit for a Spring Boot application that uses Spring Security for end user Authentication
as well as JPA for Object Relational Mapping (ORM) capabilities. The JPA provider is EclipseLink.

Here are the steps I followed.

1) Install Java 1.8.0_181 and maven 3.0.5. Set the JAVA_HOME environment variable to the JDK directory in which the bin directory resides. e.g. /usr/java/jdk1.8.0_181-amd64.
2) Use Spring Initializer (https://start.spring.io) to generate the initial maven and Java project using Spring Boot 2.0.5, choosing Web as the selected dependency.

To run the application:
a) In the top level directory, run the following commands :
       1) mvn clean install
       2) java -jar target/*.war
b) Assuming the previous step executes without issue, open a browser and visit the URL : localhost:8080.
