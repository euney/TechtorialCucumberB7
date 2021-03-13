Feature: Validation of Products Page

  @Products
  Scenario: Validation of New Product Creation
    Given the user navigates product website home page
    When the user enters the product info "MyMoney" and "4"
    And the user enters the address info "Techtorial" , "2200 E Devon" , "Des Plaines" , "IL" , "60018"
    * the user enters the card info "Visa" ,"1343565342" ,"04/22"
    And the user validate success message
    Then the user validate product details "MyMoney" , "4" ,"Techtorial" , "2200 E Devon" , "Des Plaines" , "IL" , "60018","Visa" ,"1343565342" ,"04/22"


  @Products @Outline
  Scenario Outline: Validation of New Product Creation
    Given the user navigates product website home page
    When the user enters the product info "<productName>" and "<quantity>"
    And the user enters the address info "<name>" , "<street>" , "<city>" , "<state>" , "<zipcode>"
    * the user enters the card info "<cardType>" ,"<cardNumber>" ,"<expireDate>"
    And the user validate success message
    Then the user validate product details "<productName>" , "<quantity>" ,"<name>" , "<street>" , "<city>" , "<state>" , "<zipcode>","<cardType>" ,"<cardNumber>" ,"<expireDate>"
    Examples:
      | productName | quantity | name           | street          | city        | state | zipcode | cardType         | cardNumber   | expireDate |
      | MyMoney     | 4        | Techtorial     | 2200 E Devon    | Des Plaines | IL    | 60018   | Visa             | 1343565342   | 04/22      |
      | ScreenSaver | 2        | Paul Kline     | 5 Ringer Street | Las Vegas   | NV    | 748     | MasterCard       | 123456789012 | 02/07      |
      | FamilyAlbum | 3        | Samantha Smith | 20 W Walton     | Chicago     | IL    | 60605   | American Express | 124556777    | 04/23      |
      | MyMoney     | 5        | Emily Goodman  | 234 N State     | Chicago     | IL    | 60615   | Visa             | 12456788     | 05/22      |