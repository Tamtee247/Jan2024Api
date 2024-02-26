package Jan2024Api;


import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;


public class ContentTypeResponse8 {

    @Test
    public void ContentType(){
        Response res = given().when().get("https://restful-booker.herokuapp.com/");
        System.out.println(res.getBody().prettyPrint());
        ValidatableResponse header = res.then().statusCode(200).header("Content-Type", ("text/html; charset=utf-8"));
    }
    }


