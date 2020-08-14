package services;

import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class singleEmployeeResources {
    String baseUrl= "http://info.venturepulse.org:8080/service-webapp";
    String validresourcePath ="/api/SingleEmployeeResources";
    String invalidResourcePath ="/api/SingleEmployeeResourcesByPass";
    String objectId = "5f18fdf92fc21306c59854ce";

    public void callsingleEmployeeResourcesSuccessStatus(){
        Response response = given().when().get(baseUrl+validresourcePath+ objectId).then().statusCode(200).extract().response();
        String statusLine = response.statusLine();
        int statusCode= response.getStatusCode();
        System.out.println(statusLine);
        Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");
        response.getBody().prettyPrint();
        Assert.assertEquals(statusCode,200);
    }
    public void callsingleEmployeeResourcesFailStatus(){
        Response response = given().when().get(baseUrl+invalidResourcePath+ objectId ).then().statusCode(404).extract().response();
        String statusLine = response.statusLine();
        int statusCode= response.getStatusCode();
        System.out.println(statusLine);
        Assert.assertEquals(statusLine,"HTTP/1.1 404 Not Found");
        response.getBody().prettyPrint();
        Assert.assertEquals(statusCode,404);
    }
}
