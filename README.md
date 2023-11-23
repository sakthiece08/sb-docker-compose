# spring-boot-docker-compose
This is a demo of how to use the new spring-boot-docker-compose module in Spring Boot 3.1. With this module Spring Boot will look for a Docker Compose file and automatically start/stop any containers that you have defined.

Database: mysql

[Spring Boot 3.1 RC 1 Release Notes](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.1.0-RC1-Release-Notes)

[Docker compose lifecycle management](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#features.docker-compose.lifecycle)


### Dependency
```
<dependency>
 <groupId>org.springframework.boot</groupId>
 <artifactId>spring-boot-docker-compose</artifactId>
</dependency>
```
### Notes
- No need to explicitly run docker compose up commands to pick up the configurations from Docker compose file
- Local Docker Daemon should be running 

Please refer to this blog for more details:

https://medium.com/@Teqmonic/spring-boot-3-1-docker-compose-1d75876309d6
