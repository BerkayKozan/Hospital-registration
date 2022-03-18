# Hospital-registration
### Intro
This is a basic hospital patient registration system. This is not a complete project, hospitals and patients are only defined by their name. Spring Boot is used with JPA and Hibernate. Grpc is also used, inspired by https://github.com/yidongnan/grpc-spring-boot-starter/. This project is a task called Spring Boot Task, and fits its requirements.

### Local Setup
To run the server: 

```
./gradlew :server:bootRun
```

In a different terminal window run client:

```
./gradlew :client:bootRun
```

Visit http://localhost:8082/<endpoint> to see a result.

### Endpoints
There are several endpoints you can use in this project. The endpoints used can be found at com/berkay/client/GrpcClientController.java. 

### Testing

For testing, I used Unit tests. You can simply run the tests.
