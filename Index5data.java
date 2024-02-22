package Jan2024Api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;

public class Index5data {

    @Test
    public void ResultsofIndex5() {
        RestAssured.baseURI="https://reqres.in/api/users";
        Response response = (Response) given().queryParam
                ("data.id","1").header("Content-Type","application/json; charset=UTF-8");
        String data1 = null;
        System.out.println("data.1 ="+data1);
}
}

