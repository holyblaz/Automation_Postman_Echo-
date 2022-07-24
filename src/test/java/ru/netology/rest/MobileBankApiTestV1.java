package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class MobileBankApiTestV1 {
    @Test
    void shouldReturnDemoAccounts() {
      // Given - When - Then
      // Предусловия
      given()
          .baseUri("https://postman-echo.com")
              .body("some data")
      // Выполняемые действия
      .when()
          .post("/post")
      // Проверки
      .then()
          .statusCode(200)
          .body("data", equalTo("some data"));
    }
}
