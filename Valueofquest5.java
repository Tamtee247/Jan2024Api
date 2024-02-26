package Jan2024Api;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;



public class Valueofquest5 {

    @Test
    public void valueofquest5() {
        HashMap<String,String> reqBody = new HashMap<String,String>();
        reqBody.get("id =");
        reqBody.get("first_name");
        reqBody.get("Charles");
        Response res=given().contentType(ContentType.JSON).body(reqBody).when().post("https://reqres.in/api/users");
        System.out.println("get map body = " +res.getBody().asString());
        System.out.println("contentType =" + res.contentType());



    }
}

