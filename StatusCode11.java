package Jan2024Api;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StatusCode11 {

    @Test
    public void statuscode200(){
        Response res =given().when().post("https://reqres.in/api/users");

        System.out.println(res.getBody().prettyPrint());
        res.then().statusCode(200);
}}
