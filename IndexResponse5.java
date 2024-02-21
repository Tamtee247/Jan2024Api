package Jan2024Api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class IndexResponse5 {
    @Test
    public void index5() {
        RestAssured.baseURI="https://restful-booker.herokuapp.com/";
        Response response = (Response) given().queryParam
                ("viewport", "width=device-width, initial-scale=1").header("Content-Type","text/html; charset=UTF-8");
        when().get("herokuapp.com/");
        String page1=response.htmlPath().getString("total[1].pages");
        System.out.println("page1 ="+page1);
}
}

