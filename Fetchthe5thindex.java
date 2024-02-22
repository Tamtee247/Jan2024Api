package Jan2024Api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;

public class Fetchthe5thindex {

    @Test
    public void ResultsofIndex5() {
        RestAssured.baseURI="https://reqres.in/api/users";
        Response response =
                (Response) given().queryParam("data.id")
                .header("Content-Type","application/json; charset=UTF-8");
        when().get("api/users");
        System.out.println(" response string =" + response.getBody().asString());
        String data1 =response.jsonPath().getString("data[1].id");
        System.out.println("data1.id ="+data1);
}
}

