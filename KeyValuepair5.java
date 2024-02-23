package Jan2024Api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class KeyValuepair5 {

    @Test
    public void ResultsofKeyvalue5() {
        RestAssured.baseURI="https://emailvalidation.abstractapi.com/v1/?api_key=cc9c55a436ef4300bfe9d9704f1dd31a&email=tamleonard1@gmail.com";
        Response response =
                (Response) given().queryParam("api_key","cc9c55a436ef4300bfe9d9704f1dd31a&")
                .header("Content-Type","application/json");
        when().get("https://emailvalidation.abstractapi.com/v1");
        System.out.println("response String =" + response.getBody().asString());
        System.out.println("Is_mx_found.value");

}
}

