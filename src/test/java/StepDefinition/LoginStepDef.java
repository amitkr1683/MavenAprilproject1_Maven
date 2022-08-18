package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {


    @Given("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("Enters username and password");
    }

    @When("user click Login")
    public void user_click_Login() {
        System.out.println("Clicks Login");
    }

    @Then("Welcome Page should be displayed")
    public void welcome_Page_should_be_displayed() {
        System.out.println("Welcome Page");
    }



}
