package Jan2024Api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Fetchthe5thindex {

    @Test
    public void ResultsofIndex5() {
        RestAssured.baseURI="https://reqres.in/api/users/2";
        Response response =
                (Response) given().queryParam("name","Janet")
                .header("Content-Type","application/json; charset=UTF-8");
        when().get("/api/users/");
        System.out.println(" response string" + response.getBody().asString());
        String name1 =response.jsonPath().getString("Janet");
        System.out.println("name1=" +name1);
}
}

