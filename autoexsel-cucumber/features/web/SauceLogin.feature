@SauceDemo
Feature: Verify login of https://www.saucedemo.com/

  Scenario: Login to SauceDemo and logout - v1
    Given I open web AUT
    When I enter "standard_user" in "userName" on "SauceLogin" page
    And I enter "secret_sauce" in "password"
    And I click "loginButton"
    Then I verify "pageHeader" is equals to "Swag Labs" on "Inventory" page
    And I click "menuButton"
    And I click "logout"
    
  Scenario: Login to SauceDemo and logout - v2
    Given I open web AUT
    When I enter "standard_user" in "userName" on "SauceLogin" page
    And I enter "secret_sauce" in "password"
    And I click "loginButton"
    Then I verify "pageHeader" is equals to "Swag Labs" on "Inventory" page
    And I logout from SauceDemo app
    
    