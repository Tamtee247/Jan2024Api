package Jan2024Api;

import io.restassured.response.Response;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;

public class StatusCode3 {

        @Test
        public void statuscode201(){
            Response res =given().when().post("https://reqres.in/api/users");

            System.out.println(res.getBody().prettyPrint());
            res.then().log().ifStatusCodeIsEqualTo(200);
            System.out.println("200");

        }
    }


