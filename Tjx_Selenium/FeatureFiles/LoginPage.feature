@tag
Feature: LoginPage of TJX
  I want to use this for teset History Functionality

  @tag1
  Scenario: Checking the History functionality
    Given I invoke the Browser with "https://www.tjx.com"
    Then I should see TJX Homepage
    When I click company button
    Then I veriy the dropdown of company button
    When I click History button
    Then I verify the History of TJX
