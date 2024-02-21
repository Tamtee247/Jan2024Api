package Jan2024Api;

import io.restassured.RestAssured;
import io.restassured.internal.RestAssuredResponseOptionsGroovyImpl;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;


public class BookingId7 {

    @Test
    public void Bookingid7(){
        RestAssured.baseURI="https://restful-booker.herokuapp.com/";
        RestAssured.given().queryParam("id").when().get().then().statusCode(200);
        System.out.println("id");
    }
    }


