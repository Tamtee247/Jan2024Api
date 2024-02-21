package Jan2024Api;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class ValueofBookingId7 {

    @Test
    public void firstbookingid(){
        RestAssured.baseURI="https://restful-booker.herokuapp.com/;
        String firstbookingid = RestAssured.given().queryParam("id").when().get().then().statusCode(200)
                .extract().jsonPath().getString("id");
        System.out.println("id");
    }
}
