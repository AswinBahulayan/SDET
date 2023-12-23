package api.saleForce;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateLead extends BaseClass {

	
	@Test(dependsOnMethods = "api.saleForce.CreateLead.create")
	public void update() {
		
		File filePath = new File("./src/test/resources/UpdateLeads.json");
		
		RequestSpecification input = RestAssured.given()
		.contentType("application/json")
		.when()
		.body(filePath);
		
		Response response = input.patch("/"+id);
		
		int statusCode = response.getStatusCode();
		
		//Status code validation
		response.then().assertThat().statusCode(204);
		

		
		
		
		
		
				
	}
}
