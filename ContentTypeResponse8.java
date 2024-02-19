package Jan2024Api;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ContentTypeResponse8 {

    @Test public void ContentType(){
        Response res =
         given().queryParam("id", "id").header("Content-Type", "application/json").when().post("/v1/search");
    System.out.println(res.getBody().prettyPrint());

    }
    }


