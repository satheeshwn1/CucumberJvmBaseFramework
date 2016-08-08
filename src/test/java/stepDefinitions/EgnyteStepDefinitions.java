package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.OKTALoginPage;
import utils.DriverUtils;

/**
 * Created by thivyalakshimi on 06/08/16.
 */
public class EgnyteStepDefinitions extends DriverUtils {


    @Given("^I open msp catalyst okta login page$")
    public void i_open_msp_catalyst_okta_login_page() throws Throwable {
        new OKTALoginPage().navigateToLoginPage();

    }

    @When("^I enter okta username as \"([^\"]*)\"$")
    public void iEnterOktaUsernameAs(String userName) throws Throwable {
        new OKTALoginPage().enterOktaUsername(userName);
    }


    @And("^I enter okta password as \"([^\"]*)\"$")
    public void iEnterOktaPasswordAs(String password) throws Throwable {
        new OKTALoginPage().enterOktaPassword(password);
    }

    @And("^I click on SignIn button$")
    public void iClickOnSignInButton() throws Throwable {
        new OKTALoginPage().clickOnSignIn();
    }

    @Then("^I should be taken to msp catalyst home page$")
    public void iShouldBeTakenToMspCatalystHomePage() throws Throwable {
        new HomePage().verifyPageTitle();


    }
}

