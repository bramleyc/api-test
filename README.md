# Booking API Test

This project contains a simple Spring Boot application that simulates a booking system. The task is to identify and fix the failing tests. The source code of the application is correct; the error resides in the tests themself.

## Prerequisites

1. Java 11 
2. Maven

## Setting Up and Running the Application

### 1. Compile the project

Navigate to the project root directory and run the following:

```bash
mvn clean install -DskipTests
```

This clears out any previous builds, compiles the code, and creates the distributable package. 

We have included `-DskipTests` as we know for this project we have introduced deliberate test failures, and the tests we have written need the Spring Boot application to be up and running. 

### 2. Start the application

Now you have a packaged application, we can start our SpringBoot API and start testing.

```bash
mvn spring-boot:run
```

The Spring Boot application will start, and it should be accessible on `http://localhost:8080`. 

### 3. Running Tests

With the application running inside, you can execute the tests. This should be run in a new Terminal window.

```bash
mvn test
```

This will run the tests against the Spring Boot application accessible at `http://localhost:8080`.

## Your Task

Upon running the tests, you'll notice that one or more tests are failing. Your task is to identify the erroneous tests and fix them to make all tests pass. Remember: The error is in the test, not in the application source code.

After fixing the test, run the tests again using `mvn test` to ensure that all tests pass. As the API application doesn't need changing, you will not need to recomiple, package, or restart the Spring Boot application.

## Submission

Once you have fixed the tests, you can submit your corrected test file, mentioning any specific changes you made.