package Jan2024Api;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class Fakerestapi {

    @Test(priority = 1)
    public void printBody() {
        Response res = given().when().get("https://fakerestapi.azurewebsites.net/index.html ");
        System.out.println("res = " + res.getBody().asString());
    }


    @Test
    public void getStatusCode() {
        Response res = given().when().get("https://fakerestapi.azurewebsites.net/index.html ");
        System.out.println("status code = " + res.getStatusCode());
    }

    @Test
    public void getidresponse() {
        Response res = given().when().get("https://fakerestapi.azurewebsites.net/index.html ");
        System.out.println("id = " + id());

    }

    public String id() {
        System.out.println("id");
        return null;
    }

}