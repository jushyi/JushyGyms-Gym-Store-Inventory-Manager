# User Guide for Maintaining and Updating the Application
## Introduction
This user guide provides an overview that future developers and admins can use to set up the application or perform maintenance and upgrades.
### Pre-requisites
Please familiarize yourself with the software, products, frameworks, and languages listed below before beginning. 

IntelliJ IDEA Ultimate Edition: This IDE is the main software that will be used to update, maintain, and test the application. Please familiarize yourself with the IDE. It comes with the languages and tools bundled that are listed below. 

Java: The language used to build the back end.

HTML and CSS: The languages used for the front end.

Spring: The framework for the project.

Maven: The build automation tool used for the project.

GtiLab: The version control system used in the development of the app.

## Cloning From Gitlab
These instructions will walk through how to clone and edit the project from GitLab:

1. Navigate to the GitLab repository for the project https://gitlab.com/wgu-gitlab-environment/student-repos/jmaser3/d424-software-engineering-capstone.

1a. On the repository page find the button labeled “Code”. 

1b. This will open a menu where you can then find “Clone with HTTPS” and select this.

2. Now open IntelliJ IDEA Ultimate Edition.

2a. Select “Get from VCS” in the top right.

2b. Paste the URL into the box then click “Clone.”

2c. The project should now be open in IntelliJ IDEA

3. Before modifying the code please ensure you are checked out to “working_branch”. Make all of your commits and pushes here first.

4. Once all changes are made and tested, commit and push all changes to the “master” branch.

### NOTE: Below are the file locations for the application data and business logic. These files encapsulate the core functionality and rules for the app. These files can be edited in IntelliJ IDEA and are written in Java.
Entities: Found in src->main->java->com.example.demo->domain. These are your classes for the different types of parts and products. Entities are marked with the annotation '@Entity' which tells Spring that this defines that a class can be mapped to a table.


Repositories: Found in src->main->java->com.example.demo->repositories. Repository files allow for CRUD (create, read, update, and delete) on the database. These files interact with the database and extend CrudRepository.


Service: Found in src->main->java->com.example.demo->service. These are service files and service implementation files. The service files contain declarations but not the definitions, while the implementation files have the definitions to implement the service. Services interact with repositories to retrieve and manipulate data.


Validators: Found in src->main->java->com.example.demo->validators.  This contains .java files which have the code that enforces validation rules and constraints for your data.

Controllers: Found in src->main->java->com.example.demo->controllers. These .java classes handle user requests and process the inputs to determine what should be rendered on the webpage.

### NOTE: Below are the file locations for the user interface.

HTML Templates: src->main>resources->templates. These are all your HTML files that contain the format and structure for the web pages the user sees.


CSS: found in src->main->resources->static->css. These files are used to provide additional styling to the HTML.



## NOTE: To view and test the web app, open your browser and go to localhost:8080. This will show you your webpage in its current state. You must run the application successfully in IntelliJ for this to work. 
### To run the application in IntelliJ.
1. Find the DemoApplication.java file found in src->main->java->com.example.demo
2. Open this file in IntelliJ and in the top toolbar select the green arrow. It should say “run ‘DemoApplication’”.
