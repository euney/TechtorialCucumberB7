
@weborder
Feature: WebOrder Page Food Order

  @smoke
  Scenario: Validation of Food Order For Office
    Given the user is on weborder home page
    Then the user selects "Office" option
    And the user is on the group order page
    Then the user sends invitees note "Test"
    And the user send invite list "Kushal@gmail.com" and "Priyanka@gmail.com"
    And the user validate "View Group Order" text
    * the user validate total participant is 1