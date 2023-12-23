package api.saleForce;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetLead extends BaseClass {

	@Test(dependsOnMethods = "api.saleForce.CreateLead.create")
	public void get() {

		Response response = RestAssured.get(id);
		response.prettyPrint();
		response.then().assertThat().body("FirstName", Matchers.equalTo("Eagle"));
	}

}
