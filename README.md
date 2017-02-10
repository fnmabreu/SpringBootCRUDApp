# SpringBootCRUDApplication
Spring Boot + AngularJS + Spring Data + JPA CRUD App 

CRUD application using Spring Boot, AngularJS, Spring-Data, JPA/Hibernate and MySQL. 
The application use the notion of profiles to deploy the application into two different databases [H2 & MySQL] to emulate the local and production environment.


## Technologies being used:

* Spring Boot 1.5.1.RELEASE
* Spring 4.3.6.RELEASE
* Spring Data JPA 1.11.0.RELEASE
* Hibernate 5.0.11.Final
* MySQL 5.1.40
* H2 1.4.193
* Hikari CP 2.5.1
* AngularJS 1.6.1
* Bootstrap 3.3.7
* Maven 3.3.9
* JDK 1.8
* Eclipse NEON.2


## Run the application

Via Eclipse:

Run it directly, in that case default profile will be used. In case you want a different profile to be used, create a Run configuration for you main class, specifying the profile. To do that from toolbar, select Run->Run Configurations->Arguments->VM Arguments. Add -Dspring.profiles.active=local or -Dspring.profiles.active=prod]

Via Command line:

On project root
$> java -jar target/SpringBootCRUDApplication-1.0.0.jar –spring.profiles.active=<<local or prod>>
