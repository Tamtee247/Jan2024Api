package Jan2024Api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class IndexResponse5 {
    @Test
    public void index5() {
        RestAssured.baseURI="https://reqres.in/api/users";
        Response response = (Response) given().queryParam("name", "Charles").header("Content-Type","application/json");
        when().get("v1/search");
        String name1=response.jsonPath().getString("result[5].name");
        System.out.println("name1 ="+name1);
}
}

