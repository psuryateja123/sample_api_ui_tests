package resource.step_defs;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import cucumber.api.CucumberOptions;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ResponseBody;
import org.apache.commons.lang3.StringUtils;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

public class UserStepDefinitions {
    private Response response;
    private ValidatableResponse json;
    private RequestSpecification request;


    @Then("The status code is (\\d+)")
    public void verify_status_code(int statusCode){
        given().when().get("https://jsonplaceholder.typicode.com/posts").then().statusCode(statusCode);
    }


    @Given("User hit the webservice (.*)")
    public void user_hit_the_webservice(String WebServiceURL){
        RestAssured.baseURI = WebServiceURL;
    }

    @And("^the body should not be null for (.*)")
    public void theUseridShouldNotBeNullForHttpsJsonplaceholderTypicodeComPosts(String WebServiceURL) {
        RestAssured.baseURI = WebServiceURL;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get(WebServiceURL);
        //RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts";
        String userid = response.asString();
        Assert.assertFalse(userid.isEmpty());
    }

    @And("^I valiadate the schema for comments")
    public void iValiadateTheSchema() {
        RestAssured.given()
                .when()
                .get("https://jsonplaceholder.typicode.com/comments")
                .then()
                .assertThat()
                .body(matchesJsonSchemaInClasspath("JsonSchemaFile.json"));
    }

    @And("^the \"([^\"]*)\" should not be null$")

    public void theUseridShouldNotBeNull(String data) {
        RestAssured.given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts")
                .then()
                .assertThat()
                .body(data, not(nullValue()));
    }
}

