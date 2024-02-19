package Jan2024Api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class StringResponseBody1 {

    @Test
    public void createuserwithabody(){
        HashMap<String,String>reqBody = new HashMap<String,String>();
        reqBody.put("id","205");
        reqBody.put("createAt","2024-02-17T17:44:25.37OZ");
        Response res=given().contentType(ContentType.JSON).body(reqBody).when().post("https://reqres.in/api/users");
        System.out.println("post map body = " +res.getBody().asString());
        System.out.println("contentType =" + res.contentType());
    }
}
