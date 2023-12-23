package api.saleForce;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateLead extends BaseClass {

	@Test
	public void create() {
		
	
		
		// Form the Request body
		
		RequestSpecification inputRequest = RestAssured.given()
		.contentType("application/json")
		.when()
		.body("{\r\n"
				+ "    \"FirstName\": \"Eagle\",\r\n"
				+ "    \"LastName\": \"R\",\r\n"
				+ "    \"Company\": \"Eagle\"\r\n"
				+ "\r\n"
				+ "}");
		
		// Send the Request
		Response response = inputRequest.post();
		
		//Extract ID
		
		 id = response.jsonPath().getString("id");
		
		//Status code validation
		
		response.then().assertThat().statusCode(201);
		
		
		
		
		
		
		
		
	}
}
