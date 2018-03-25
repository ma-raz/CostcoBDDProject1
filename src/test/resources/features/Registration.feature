Feature:Registration Functionality

  Background:  Given Not a valid user
    When User browse to the site
    Then Costco home page will be display

  Scenario: User Registered for a new account
    When User click Register link
    Then Signin page will be dispaly
    When User click on Create Account
    Then Registration Page will display
    And  User enter email address as "ma_raz@yahoo.com"
    And  User enter password as "amar1234@"
    And  user enter confirm password as "amar1234@"
    When User click Register button
    Then User will get welcome message

