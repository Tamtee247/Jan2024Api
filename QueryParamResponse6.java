package Jan2024Api;

import io.restassured.response.Response;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;

public class QueryParamResponse6 {
    @Test
    public void responsebodyqueryparameter(){
        Response res = given().queryParam("id").when().get("https://restful-booker.herokuapp.com/");
        System.out.println(res.getBody().asString());
    }
}

