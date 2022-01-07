## Spring Boot Multitenancy Sample Application
This project show how to implement multitenancy by using hibernate & springboot on same database separate schema.

## Prerequisites
Install postgresql in local environment via docker. Locate postgresql folder. And run: 
```bash
docker-compose up
```

After installation postgresql, connect database via credentials(user:user, password:password, port:5432, database: multitenancy). 
Then run creation schemas and tables scripts in scripts.sql file.

## Structure
![Structure](structure.png?raw=true)


## Let's Run
Default port: 8080
Application understands tenant by passing tenant parameter in header. When you send request to localhost:8080 by passing tenant=tenant1 to header, application connects tenant1 schema.

## Licence
Developed by © [Fuat Buğra AYDIN](https://www.linkedin.com/in/fuatbugraaydin/)
