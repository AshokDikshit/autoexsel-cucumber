@verifyStepDef
Feature: Verify search functionality on www.google.com

  Scenario: Launch browser and open google homepage
    Given that user opens the google homepage
    Then verify that google homepage is opened

  Scenario: Perform text search on google homepage
    Given that user is on google homepage
    Then user enters "Automation" in google search box
    Then user clicks on search button
    Then verify that "Automation" is appearing in search result
