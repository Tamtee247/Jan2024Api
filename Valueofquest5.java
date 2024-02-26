package Jan2024Api;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;


public class Valueofquest5 {

    @Test
    public void valueofquest5() {
        RestAssured.baseURI="https://restful-booker.herokuapp.com/";
        Response response = (Response) given().queryParam("name","Charles").header("Content-Type","application/json");
        when().get("v1/search");
        String name1=response.jsonPath().getString("result[5].name");
        System.out.println("name1 ="+name1);



    }
}

