# TODOLIST API 

ToDo List API created with Spring Boot for studying purposes.

## Configuration

https://start.spring.io/

## Production vs Development

## Docker

## Database Management and Migrations

https://www.youtube.com/watch?v=LX5jaieOIAk

## Project Package Structure 

https://www.baeldung.com/spring-boot-package-structure

## User Management and Authentication

https://spring.io/guides/gs/securing-web
https://www.youtube.com/watch?v=iJ2muJniikY
https://docs.spring.io/spring-security/reference/servlet/index.html

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

