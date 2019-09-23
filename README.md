# Book System Service

## How It Works

A simple service that allows CRUD operations for a book managing system that stores books and respective notes.

## Project Details

Config server: https://github.com/ersJava/book-service-config-server

Please see YAML application usage.

This application implements REST microservices, queue producers and consumers, and using Feign web service clients.The Book Service is a typical Spring Boot REST web service with Controller, DAO, and Service Layer components and acts as the edge service for the system with Eureka. All operations are done through the Book Service.

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
