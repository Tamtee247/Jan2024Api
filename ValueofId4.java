package Jan2024Api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ValueofId4 {
    @Test
    public void printallidvalues(){
        RestAssured.baseURI="https://reqres.in/api/users";
        Response response= given().queryParam("name","George").header("Content-Type","application/json").when()
                .get("/v1/search"); System.out.println("string id =" + response.getBody().asString());
        String id= response.jsonPath().getString("result.id");
        System.out.println("result.id ="+ id);

    }
}
