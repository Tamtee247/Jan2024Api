package Jan2024Api;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.internal.RestAssuredResponseOptionsImpl;
import io.restassured.response.Response;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;


public class Valueofquest5 {

    @Test
    public void valueofquest5() {
        RestAssured.baseURI = "https://reqres.in/api/users";
        Response res = given().queryParam("name","Janet").header("Content-Type","application/json").when().post("/v1/search");
        System.out.println("id:5");
        System.out.println("Charles Morris");
        System.out.println("email:charlesmorris@reqres.in");
        System.out.println("res = "+res.getBody());
        System.out.println("res as string =" +res.getBody());

    }
}

