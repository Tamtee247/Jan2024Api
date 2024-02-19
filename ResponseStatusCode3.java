package Jan2024Api;

import io.restassured.response.Response;
import org.hamcrest.Matcher;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ResponseStatusCode3 {

        @Test
        public void statuscode201(){
            Response res =given().when().post("https://reqres.in/api/users");

            System.out.println(res.getBody().prettyPrint());
            res.then().statusCode(201);

        }
    }


