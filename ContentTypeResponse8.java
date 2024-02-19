package Jan2024Api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.sessionId;

public class ContentTypeResponse8 {

    public void validatecontentType(){
        Response res = given().when().get("https://reqres.in/api/users");
    System.out.println(res.getBody().prettyPrint());
        String header = res.header("Content-Type","application/json;charset=utf-8);


    }
    }


