package Jan2024Api;

import io.restassured.RestAssured;
import io.restassured.internal.RestAssuredResponseOptionsGroovyImpl;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class BookingId7 {

    @Test
    public void ValueofBookingid7(){
        RestAssured.baseURI="https://restful-booker.herokuapp.com/";
        Object statusCode = given().queryParam("id").when().get().then().statusCode(200);
        RestAssuredResponseOptionsGroovyImpl response = null;
        String id =response.jsonPath().getString("id");
        System.out.println("id");
    }
}
