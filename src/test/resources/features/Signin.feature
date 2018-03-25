Feature: SignIn Functionality

  Scenario: SignIn with valid email and valid password

    Given Not a valid user
    When User browse to the site
    Then Costco home page will be display
    When User click Signin link

    Then Signin page will be dispaly
    When User enter valid email address as "ma_raz@yahoo.com"
    And  User enter valid password as "amar1234@"
    And  User click signin button
    Then My account page will be display


  #Scenario: SignIn with invalid email and invalid password

    #Given not a validated User
    #When User Browse to the Site
    #Then Home page should be display

    #Then User Click Signin link
    #Then Signin Page will be display

    #Then User enter invalid email "mma_raz@yahoo.com"
    #Then User enter invalid password "aamar1234@"
    #And User click on Sign In link
    #Then Unsuccess message will display

  #Scenario: SignIn with valid email and invalid password

    #Given not a validated User
    #When User Browse to the Site
    #Then Home page should be display
    #Then User Click Signin link
    #Then Signin Page will be display
    #Then User enter valid email "ma_raz@yahoo.com"
    #Then User enter invalid password "aamar1234@"
    #And User click on Sign In link
    #Then Unsuccess message will display

