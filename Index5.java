package Jan2024Api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;

public class Index5 {

    @Test
    public void ResultsofIndex5() {
        RestAssured.baseURI="https://restful-booker.herokuapp.com/";
        Response response = (Response) given().queryParam
                ("rel","stylesheet").header("Content-Type","text/html; charset=UTF-8");
        String viewport = null;
        System.out.println("viewport ="+viewport);
}
}

