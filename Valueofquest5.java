package Jan2024Api;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;


public class Valueofquest5 {

    @Test
    public void valueofquest5() {
        RestAssured.baseURI="https://reqres.in/api/users";
        Response response = (Response) given().queryParam("name","Charles").header("Content-Type","application/json");
        when().get("/v1/search"); System.out.println("string id =" + response.getBody().asString());
        String name5 =response.jsonPath().getString("results[5].name");
        System.out.println("name5 = " + name5);



    }}

