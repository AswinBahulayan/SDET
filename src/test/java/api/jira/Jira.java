package api.jira;

import api.pojo.CreateIssuePojo;
import api.pojo.GetIssuePojo;
import api.secret.Secret;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.io.File;

public class Jira extends BaseClass {

    public static CreateIssuePojo createIssuePojo;
    public static GetIssuePojo getIssuePojo;

    @Test
    public void createIssue(){
        File file = new File("./src/test/resources/createRequest.json");
        Response response = RestAssured.given()
                .when().body(file).post("issue/");
        response.then().assertThat().statusCode(200);
        response.prettyPrint();
        ResponseBody body = response.getBody();
        System.out.println(body.prettyPrint());
        createIssuePojo= body.as(CreateIssuePojo.class);
        response.then().assertThat().statusCode(201);
        response.then().assertThat().body("id", Matchers.equalTo(String.valueOf(createIssuePojo.getId())));
    }

    @Test(dependsOnMethods = "api.Jira.createIssue")
    public void getIssue(){
        Response response = RestAssured.given()
                .when().get("issue/"+createIssuePojo.getId());
        response.prettyPrint();
        ResponseBody body = response.getBody();
        getIssuePojo= body.as(GetIssuePojo.class);
        System.out.println(getIssuePojo.getFields().getAssignee());
        System.out.println(getIssuePojo.getFields().getCreator().getAvatarUrls().get_16x16());
    }
}
