package Jan2024Api;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ValueofBookingId7 {

    @Test
    public void firstbookingid(){
        RestAssured.baseURI="https://restful-booker.herokuapp.com/";
                RestAssured.given().queryParam("id").when().get().then().statusCode(200)
                .extract().jsonPath().getString("id");
        System.out.println("id");
    }
}
