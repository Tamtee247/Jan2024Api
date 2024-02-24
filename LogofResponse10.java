package Jan2024Api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;


import static io.restassured.path.json.JsonPath.given;

public class LogofResponse10 {
    
   @Test
   public void responselog(){
        
        Response res = given().when().get("https://reqres.in/api/users");
        res.then().log().all();

    }

    private RestAssured given() {
        return null;
    }


}