# spring-boot-rest-api
Spring Boot Application with Rest APIs

Steps to Build and Run
======================

mvn clean install
java -jar target/spring-boot-rest-api.jar

Alternatively can be executed via docker image
==============

docker run -p 8080:8080 razatg/spring-boot-rest-api

API End Points
==============

GET ALL Topics - GET - http://localhost:8080/topics

GET A Specific Topic - GET  - http://localhost:8080/topics/{id}

Create a Topic - POST - http://localhost:8080/topics

  Sample Payload
  {
  "id": "nodejs",
  "name": "Node JS",
  "description": "Node JS Description"
  }

Update a Topic - PUT - http://localhost:8080/topics/{id}

  Sample Request Payload
  {
  "id": "java",
  "name": "Core Java",
  "description": "Updated Java Description"
  }

Delet a Topic - DELETE - http://localhost:8080/topics/{id}
