package Jan2024Api;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class LogofRequest9 {

    @Test
    public void requestlog(){
        Response res = given().when().log().all().get("https://reqres.in/api/users");
        System.out.println("res =" +res.getBody().prettyPrint());
    }
}

