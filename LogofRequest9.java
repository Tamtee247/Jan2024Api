package Jan2024Api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class LogofRequest9 {

    public void requestlog(){
        Response res = given().when().log().all().get("https://reqres.in/api/users?page=2");
        System.out.println("res =" +res.getBody().prettyPrint());
    }
}

