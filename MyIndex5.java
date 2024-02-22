package Jan2024Api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;

public class MyIndex5 {

    @Test
    public void ResultsofIndex5() {
        RestAssured.baseURI="https://reqres.in/api/users";
        Response response = (Response) given().queryParam
                ("data.id","1").header("Content-Type","application/json; charset=UTF-8");
        when().get("api/users");
        String data1 =response.jsonPath().getString("data.id");
        System.out.println("data.id ="+data1);
}
}

