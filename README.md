# TODOLIST API 

ToDo List API created with Spring Boot for studying purposes.

## General 

https://www.baeldung.com/rest-with-spring-series

## Configuration

https://start.spring.io/

## Production vs Development

## Docker

## Database Management and Migrations

https://www.youtube.com/watch?v=LX5jaieOIAk

## Project Package Structure 

- https://www.baeldung.com/spring-boot-package-structure
- https://docs.spring.io/spring-boot/reference/using/structuring-your-code.html
- https://malshani-wijekoon.medium.com/spring-boot-folder-structure-best-practices-18ef78a81819
- https://deepeshkumarkurapati.medium.com/exploring-key-architectures-in-spring-boot-layered-mvc-and-microservices-d0f0c370e206
- https://www.geeksforgeeks.org/spring-boot-architecture/
- https://www.baeldung.com/hexagonal-architecture-ddd-spring

## Spring Data and JPA

- https://docs.spring.io/spring-boot/reference/data/sql.html#data.sql.jpa-and-spring-data

## User Management and Authentication

- https://spring.io/guides/gs/securing-web
- https://www.youtube.com/watch?v=iJ2muJniikY
- https://docs.spring.io/spring-security/reference/servlet/index.html

1. Learn the architecture of Spring Authentication (https://docs.spring.io/spring-security/reference/servlet/authentication/architecture.html)
2. Get into basics of Username/Password Authentication (https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/index.html)
3. Learn about SecurityFilters (https://docs.spring.io/spring-security/reference/servlet/architecture.html#servlet-security-filters)
4. Learn about DaoAuthenticationProvider (https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/dao-authentication-provider.html)
5. Publish AuthenticationManager bean (https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/index.html#publish-authentication-manager-bean)
6. Create an REST Endpoint to Authentication (https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/index.html#publish-authentication-manager-bean) 
>  ### Note: 
> In this example, it is your responsibility to save the authenticated user in the SecurityContextRepository if needed. For example, if using the HttpSession to persist the SecurityContext between requests, you can use HttpSessionSecurityContextRepository.
7. Learn how to store SessionManagement (https://docs.spring.io/spring-security/reference/servlet/authentication/session-management.html#store-authentication-manually)
8. Implement the custom SessionManagement (https://docs.spring.io/spring-security/reference/servlet/authentication/session-management.html#use-securitycontextholderstrategy)

### Storage User Credentials 

Create a custom UserDetailsService and retrieve User from database

General Documentation: https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/storage.html

Base Tutorial: https://www.baeldung.com/spring-security-authentication-with-a-database

About UserDetailsService: 
- https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/core/userdetails/UserDetailsService.html
- https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/user-details-service.html

About UserDetails:
- https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/user-details.html
- https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/core/userdetails/UserDetails.html
- Base Impl of User Details of Spring: https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/core/userdetails/User.html

About Password Encoding:
- https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/in-memory.html

About Password Erasure:
- https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/credentials-container.html
- https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/erasure.html

1. Create a custom UserDetailsService that serves custom UserDetails (https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/user-details-service.html)
2. Create a User entity on DB that stores Username and Password (see also: [Spring Data and JPA](#Spring-Data-and-JPA))
3. Create a custom implementation of UserDetails that retrieves from User
4. Expose new UserDetailsService as a Bean

>  ### Note: 
> This can be done by expose an implementation of UserDetailsService as a @Service, or as a @Bean that returns the custom implementation of UserDetailsService

Next Steps:
Write an implementation of User creation, paying attention to password encoding and storage:
- https://docs.spring.io/spring-security/reference/features/authentication/password-storage.html#authentication-password-storage-boot-cli
- https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/password-encoder.html
Also do the Spring create an admin user at startup

### Authorization

I am using method based authorization:
https://docs.spring.io/spring-security/reference/servlet/authorization/method-security.html

# REST API

How to create a Controller:
https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller.html

How to get mapped RequestBody:
https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller/ann-methods/requestbody.html

## Error Handling and Validation

https://www.baeldung.com/exception-handling-for-rest-with-spring
https://spring.io/blog/2013/11/01/exception-handling-in-spring-mvc
https://medium.com/paysafe-bulgaria/springboot-dto-validation-good-practices-and-breakdown-fee69277b3b0