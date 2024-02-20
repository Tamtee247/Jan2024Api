package Jan2024Api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class IndexResponse5 {
    @Test
    public void index5() {
        RestAssured.baseURI="https://reqres.in/api/users";
        Response response = (Response) given().queryParam
                ("total_pages", "2").header("Content-Type","application/json");
        when().get("api/users");
        String page1=response.jsonPath().getString("total[2].pages");
        System.out.println("page1 ="+page1);
}
}

