package Jan2024Api;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class Fakerestapi {

    @Test(priority = 1)
    public void printBody() {
        Response res = given().when().get("https://fakerestapi.azurewebsites.net/api/v1/Activities ");
        System.out.println("res = " + res.getBody().asString());
    }


    @Test
    public void getlistofauthors() {
        Response res = given().when().get("https://fakerestapi.azurewebsites.net/api/v1/Activities ");
        System.out.println("list of authors = " + listofauthors());
    }

    public String listofauthors() {
        System.out.println("list of authors");

        return null;
    }

    @Test
    public void getidresponse() {
        Response res = given().when().get("https://fakerestapi.azurewebsites.net/api/v1/Activities ");
        System.out.println("id = " + id());

    }

    public String id() {
        System.out.println("id");
        return null;
    }

}