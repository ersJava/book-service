# Book System Service

## How It Works

A simple service that allows CRUD operations for a book managing system that stores books and respective notes.

Please see YAML for API documenation.

## Project Details

Config server: https://github.com/ersJava/book-service-config-server

This application implements REST microservices, queue producers and consumers, and using Feign web service clients.The Book Service is a typical Spring Boot REST web service with Controller, DAO (utilizing Jdbc template and prepared statements), and Service Layer components and acts as the edge service for the system with Eureka. Exceptions are handled through Controller Advice and return proper HTTP status codes and data when exception occur.

All operations are done through the Book Service. 

### Technologies Used
* Java
* Spring Boot
* Feign
* Eureka Server
* MySQL
* RabbitMQ
* Cache
* Mockito

### Collaboration By

* René Serulle: https://github.com/insomnyak
* Fahad Hilmi: https://github.com/fahadhilmi
* Beth Sergeant: https://github.com/ersJava
