package com.shyshko.tests;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    protected static void initTests() {
        RestAssured.baseURI = "https://reqres.in";
    }

    protected RequestSpecification getRequestSpecification(String host) {
        return new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri(host)
                .build();
    }

    protected ResponseSpecification getResponseSpecification(String host) {
        return new ResponseSpecBuilder()
                .setDefaultParser(Parser.JSON)
                .build();
    }
}