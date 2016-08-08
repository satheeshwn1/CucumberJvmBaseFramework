$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/EgnyteLogin.feature");
formatter.feature({
  "line": 1,
  "name": "As a user,I want to be able to single sign on to Egnyte tool",
  "description": "",
  "id": "as-a-user,i-want-to-be-able-to-single-sign-on-to-egnyte-tool",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify user is able to single sidgn on to egnyte without additional login prompts",
  "description": "",
  "id": "as-a-user,i-want-to-be-able-to-single-sign-on-to-egnyte-tool;verify-user-is-able-to-single-sidgn-on-to-egnyte-without-additional-login-prompts",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open msp catalyst okta login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter okta username as \"thivyae@thoughtworks.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter okta password as \"Test123!@#\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should be taken to msp catalyst home page",
  "keyword": "Then "
});
formatter.match({
  "location": "EgnyteStepDefinitions.i_open_msp_catalyst_okta_login_page()"
});
formatter.result({
  "duration": 7621568391,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "thivyae@thoughtworks.com",
      "offset": 26
    }
  ],
  "location": "EgnyteStepDefinitions.iEnterOktaUsernameAs(String)"
});
formatter.result({
  "duration": 89960110,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test123!@#",
      "offset": 26
    }
  ],
  "location": "EgnyteStepDefinitions.iEnterOktaPasswordAs(String)"
});
formatter.result({
  "duration": 58895851,
  "status": "passed"
});
formatter.match({
  "location": "EgnyteStepDefinitions.iClickOnSignInButton()"
});
formatter.result({
  "duration": 949614311,
  "status": "passed"
});
formatter.match({
  "location": "EgnyteStepDefinitions.iShouldBeTakenToMspCatalystHomePage()"
});
formatter.result({
  "duration": 28455915,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c\"[Recipes]\"\u003e but was:\u003c\"[Stringeerw]\"\u003e\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat pages.HomePage.verifyPageTitle(HomePage.java:29)\n\tat stepDefinitions.EgnyteStepDefinitions.iShouldBeTakenToMspCatalystHomePage(EgnyteStepDefinitions.java:41)\n\tat ✽.Then I should be taken to msp catalyst home page(features/EgnyteLogin.feature:8)\n",
  "status": "failed"
});
});