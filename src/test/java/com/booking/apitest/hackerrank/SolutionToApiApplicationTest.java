package com.booking.apitest.hackerrank;

import io.restassured.RestAssured;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class SolutionToApiApplicationTest {

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
    }

    @Test
    public void testGetBookingReference() {
        given()
            .when()
                .get("/bookings/1")
            .then()
                .statusCode(200)
                .body("reference", equalTo("ABC123"));
    }

    @Test
    public void testGetBookingName() {
        given()
            .when()
                .get("/bookings/1")
            .then()
                .statusCode(200)
                .body("name", equalTo("John Doe"));
    }

    @Test
    public void testGetBookingPrice() {
        given()
            .when()
                .get("/bookings/1")
            .then()
                .statusCode(200)
                .body("price", equalTo(150.0f));
    }

    @Test
    public void testGetBookingAirportLocation() {
        given()
            .when()
                .get("/bookings/1")
            .then()
                .statusCode(200)
                .body("airport", equalTo("MAN"));
    }

    @Test
    public void testGetBookingDates() {
        given()
            .when()
                .get("/bookings/1")
            .then()
                .statusCode(200)
                .body("startDate", equalTo("2023-01-01"))
                .body("endDate", equalTo("2023-01-10"));
    }

    @Test
    public void testGetInvalidBookingReference() {
        given()
            .when()
                .get("/bookings/2")
            .then()
                .statusCode(404);
    }
}
