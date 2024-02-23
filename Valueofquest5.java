package Jan2024Api;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;


public class Valueofquest5 {

    @Test
    public void valueofquest5() {
        RestAssured.baseURI="https://emailvalidation.abstractapi.com/v1/?api_key=cc9c55a436ef4300bfe9d9704f1dd31a&email=tamleonard1@gmail.com";
        Response response = (Response) given().queryParam("api_key","cc9c55a436ef4300bfe9d9704f1dd31a&").header("Content-Type","application/json");
        when().get("v1");
        RestAssured.baseURI= response.jsonPath().getString("Is_mx_found.value");
        System.out.println("is_mx_found");
        System.out.println("value:true");
        System.out.println("text:True");
    }}

