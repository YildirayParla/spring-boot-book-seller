# Spring Boot Book Seller
###Endpoints

###Sign-Up
...
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 71

{
"name":"user",
"username":"user",
"password":"user"
}
...

###Sign-In
...
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 51

{
"username":"user",
"password":"user"
}
...
