package com.shyshko.tests;

import io.qameta.allure.*;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static io.restassured.RestAssured.given;

public class ApiTests extends BaseTest {

    @Step("Test POST request to create a new user")
    @Description("This test attempts to register a new user")
    @Owner("Valeriia Shyshko")
    @TmsLink("TC-111")
    @Test
    public void createNewUser() {

        byte[] body;
        try {
            body = Files.readAllBytes(Path.of("/Users/valeriiashyshko/IdeaProjects/projects/aqa-pet/ApiTesting/src/test/resources/body.json"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        addAttachment("body.json");

        given()
                .spec(getRequestSpecification("https://reqres.in"))
                .body(body)
                .when()
                .post("/api/users")
                .then()
                .statusCode(201)
                .log()
                .all();
    }

    @Attachment
    public byte[] addAttachment(String fileName) {
        try {
            return Files.readAllBytes(Path.of("src/test/resources", fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Step("GET request to get a specific user")
    @Owner("Valeriia Shyshko")
    @Description("We can check user by using his id (e.g. 2)")
    @Test
    public void getCreateddUser() {
        addAttachment("body.json");

        given()
                .spec(getRequestSpecification("https://reqres.in"))
                .when()
                .get("/api/users/2")
                .then()
                .statusCode(200)
                .log()
                .all();
    }

    @Step("PUT to update a user")
    @Owner("Valeriia Shyshko")
    @Description("This test attempts to update an existing user")
    @Test
    public void updateExistingUser() {
        byte[] updateBody;
        try {
            updateBody = Files.readAllBytes(Path.of("/Users/valeriiashyshko/IdeaProjects/projects/aqa-pet/ApiTesting/src/test/resources/updateBody.json"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        given()
                .spec(getRequestSpecification("https://reqres.in"))
                .body(updateBody)
                .when()
                .put("/api/users/2")
                .then()
                .statusCode(200)
                .log()
                .all();
    }

    @Step("GET request to get list of all users")
    @Owner("Valeriia Shyshko")
    @Description("Test to get list of all users")
    @Test
    public void getListOfUsers() {
        given()
                .spec(getRequestSpecification("https://reqres.in"))
                .when()
                .get("/api/users?page=2")
                .then()
                .statusCode(200)
                .log()
                .all();
    }

    @Step("DELETE request to delete a specific user")
    @Owner("Valeriia Shyshko")
    @Description("This test attempts to delete an existing user")
    @Test
    public void deleteUser() {
        given()
                .spec(getRequestSpecification("https://reqres.in"))
                .when()
                .delete("/api/users/2")
                .then()
                .statusCode(204)
                .log()
                .all();
    }
}