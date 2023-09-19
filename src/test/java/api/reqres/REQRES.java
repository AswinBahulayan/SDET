package api.reqres;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class REQRES {

    @BeforeMethod
    public void beforeTest(){
        RestAssured.baseURI="https://reqres.in/api";
        RestAssured.requestSpecification=RestAssured.given().contentType("application/json");
    }

    @Test
    public void getUsers(){
        Response page = RestAssured.given().queryParam("page", "2")
                .when()
                .accept("application/json")
                .get("/users");
        page.then().log().all();
        String s = page.getBody().prettyPrint();
        System.out.println(s);
    }

    @Test
    public void createUser(){
        Response page = RestAssured.given()
                .when()
                .accept("application/json")
                .post("/users");
        String s = page.getBody().prettyPrint();
        System.out.println(s);
    }
}
