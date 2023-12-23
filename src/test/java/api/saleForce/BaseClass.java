package api.saleForce;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {

   public static String access_token;
   public static String id;
    @BeforeMethod
	public void token() {

		// Endpoint Url
		RestAssured.baseURI="https://login.salesforce.com/services/oauth2/token";

		// Request Body

		RequestSpecification inputRequest = RestAssured.given()
		.formParam("grant_type", "password")
		.formParam("client_id", "3MVG9pRzvMkjMb6lZlt3YjDQwe0hk0f5ZPyWD38tfPYQ75KXUzZBGzM_c7I0o3yc6ua1IUk6lEQIy4U2sByrg")
		.formParam("client_secret", "79FFF874D54193B377A60354C71CBBE83120AD28A5D6BC536D2F68C94645DE98")
		.formParam("username", "ranjini.r@testleaf.com")
		.formParam("password", "Testleaf$1234")
		.contentType("application/x-www-form-urlencoded");
		
		// Send Request
		Response response = inputRequest.post();
	
		
		 access_token = response.jsonPath().get("access_token");
		//String token = response.jsonPath().getString("access_token");
		
		//Endpoint 
		RestAssured.baseURI="https://testleaf30-dev-ed.develop.my.salesforce.com/services/data/v58.0/sobjects/Lead";
		
		//Authentication
		
		RestAssured.authentication=RestAssured.oauth2(access_token);
		
		
		
		
		
		
	}
}
