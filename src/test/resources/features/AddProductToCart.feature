Feature: Product Add to Shoping Cart

  Background:
    Given Not a valid user
    When User browse to the site
    Then Costco home page will be display

    When User click Signin link
    Then Signin page will be dispaly
    When User enter valid email address as "ma_raz@yahoo.com"
    And  User enter valid password as "amar1234@"
    And  User click signin button

    Then My account page will be display

  Scenario:
    #Given As a valid user

    When User move cursor to grocery
    Then grocery page will be drop down
    And User select a category as "Water & Beverages"
    #Then Water & Beverages page will be display
    #When Popup window will open
    Then User enter zipcode as "10461"
    And User click set delivery zip code
    When User select a product
    And  User click Add to cart button
   # Then Popup window will open
    And  User click view cart button
    Then shopping cart page will open



