# user-management-REST-API
User Management REST API

This is a User Management REST API built using Java Spring Boot framework with MySQL database. 
The API allows users to create, read, update, and delete user information.


Technologies used

1. Java Spring Boot
2. MySQL
3. Postman
4. IntelliJ IDEA

Prerequisites
Before running the application, you need to have the following:

1. Java Development Kit (JDK) installed on your system
2. IntelliJ IDEA or any preferred IDE of your choice
4. MySQL database running
3. Postman installed for testing the API endpoints

Getting started
To get started with the project, follow these steps:

1. Clone the repository to your local machine.
2. Navigate to the project directory in your terminal.
3. Open src/main/resources/application.properties file and update the database connection properties.
4. Run the following command to start the application:
     
     mvn spring-boot:run
     
5. The application will start running on http://localhost:8080.

API endpoints

The following endpoints are available in the API:

>> Create User:

POST /api/users

Create a new user. Required fields: firstName, lastName, email.

>> Get User:

GET /api/users/{id}

Get user by id.

>> Get All Users:

GET /api/users
Get all users.

>> Update User:

PUT /api/users/{id}

Update user by id.

>> Delete User:

DELETE /api/users/{id}

Delete user by id.

Testing the API:
You can test the API endpoints using Postman. 

Conclusion:
This is a basic implementation of User Management REST API using Java Spring Boot with MySQL database. 
Feel free to extend the functionality as per your requirements.


