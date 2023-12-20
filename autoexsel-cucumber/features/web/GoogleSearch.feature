@verifyStepDef
Feature: Verify search functionality of www.google.com

  Scenario: Launch browser and open google homepage
    Given that user opens the google homepage
    Then verify that google homepage is opened

  Scenario: Perform text search on google homepage
    Given that user opens the google homepage
    When verify that google homepage is opened
