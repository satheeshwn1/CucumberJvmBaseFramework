Feature: As a user,I want to be able to single sign on to Egnyte tool

  Scenario: Verify user is able to single sidgn on to egnyte without additional login prompts
    Given I open msp catalyst okta login page
    When  I enter okta username as "thivyae@thoughtworks.com"
    And I enter okta password as "Test123!@#"
    And I click on SignIn button
    Then I should be taken to msp catalyst home page

