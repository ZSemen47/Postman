package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {

    @Test
    void postRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .body("This is expected to be sent back as part of response body")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body"))
        ;
    }
}
