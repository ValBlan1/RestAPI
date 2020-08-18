package steps.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import services.singleEmployeeResources;

public class SingleEmployeeInvalidCallStepsDefinition {
    String baseUrl = "";
    String resourcePath = "";
    String objectId="5c4951522fc21350f886baf2/ssn";
    int actualStatusCode =0;
    int expectedStatusCode=404;


    @Given("baseUrl and valid resourcePath")
    public void baseurl_and_invalid_resourcePath() {
        baseUrl ="http://info.venturepulse.org:8080/service-webapp";
        resourcePath = "/api/SingleEmployeeResources/5c4951522fc21350f886baf2/ssn";

    }

    @When("Make a valid GET call")
    public void make_a_invalid_GET_call() {
        actualStatusCode = singleEmployeeResources.getSingleEmployeeResourcesUnsuccessStatus(baseUrl,resourcePath,objectId);

    }

    @Then("I should received status code 404")
    public void i_should_received_status_code(Integer int1) {
        Assert.assertEquals(expectedStatusCode,actualStatusCode);
    }



}
