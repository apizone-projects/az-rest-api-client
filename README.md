# az-rest-api-client

Spring REST Template Client with ResponseErrorHandler for text/plain response and non HTTP_OK responses 

##### Creating Error Handler
1. Create a class that extends `org.springframework.web.client.ResponseErrorHandler`
2. Add an instance of above Class to Rest Teamplate Error Handler method `restTemplate.setErrorHandler(new CommonErrorHandler())`
