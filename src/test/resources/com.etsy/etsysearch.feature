@search
Feature: Etsy Search Functionality

  Background: navigate to Etsy
    Given the user navigates to the "https://www.etsy.com"

  @hat @tc1 @smoke @regression
  Scenario: Validation of etsy search
    When the user search with "Hat"
    Then the user should see the title "Hat | Etsy"

  @key @tc2 @smoke  @regression
  Scenario: Validation of etsy search
    When the user search with "Key"
    Then the user should see the title "Key | Etsy"

  @pin @tc3 @regression
  Scenario: Validation of etsy search
    When the user search with "Pin"
    Then the user should see the title "Pin | Etsy"