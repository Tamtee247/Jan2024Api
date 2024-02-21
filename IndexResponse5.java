package Jan2024Api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class IndexResponse5 {
    @Test
    public void index5() {
        RestAssured.baseURI="https://fonts.googleapis.com/css?family=Cabin";
        Response response = (Response) given().queryParam
                ("stylesheet").header("Content-Type","text/html; charset=UTF-8");
        when().get("https://fonts.googleapis.com/css?family=Cabin");
        String page1=response.jsonPath().getString("total[1].pages");
        System.out.println("page1 ="+page1);
}
}

