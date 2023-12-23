package api.cowin;

import api.cowinpojo.AllState;
import api.cowinpojo.States;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import org.testng.annotations.BeforeTest;

public class GetStates {

    @BeforeTest
    public void base(){
        RestAssured.baseURI="https://cdn-api.co-vin.in/api/v2/admin/location/states";
//        RestAssured.requestSpecification=RestAssured.given().contentType("application/json");
    }

    @Test
    public void getStates(){
        RestAssured.baseURI="https://cdn-api.co-vin.in/api/v2/admin/location/states";
        Response response=RestAssured.given().when().get();
        AllState states = response.as(AllState.class);
        States[] state = states.getState();
        for (States e:
             state) {
            System.out.println(e.getStateName());
            System.out.println(e.getState_id());
        }
    }
}
