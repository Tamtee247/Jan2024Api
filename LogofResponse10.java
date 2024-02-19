package Jan2024Api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.path.json.JsonPath.given;

public class LogofResponse10 {
    
    public void responselog(){
        
        Response res = given().when().get("https://reqres.in/api/users?page=2");
        res.then().log().all();

    }

    private RestAssured given() {
        return null;
    }


}