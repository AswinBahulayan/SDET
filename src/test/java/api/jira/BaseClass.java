package api.jira;

import api.secret.Secret;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

    @BeforeMethod
    public void authenticate(){
        RestAssured.baseURI="https://testjirafeb2023.atlassian.net/rest/api/2/";
        RestAssured.authentication = RestAssured.preemptive().basic(Secret.userName,Secret.password);
        RestAssured.requestSpecification=RestAssured.given().contentType("application/json");
    }
}
