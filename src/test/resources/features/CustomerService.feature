Feature: CustomerService feature

  Scenario:
    Given Not a validated user
    When User browse to the site
    Then Costco home page will be display
    When User click customer service page link
    Then Customer service page will be open


    Scenario:Select membership from help topics list

    When User select membership from list
    Then Related page will open
  Scenario:Select credit card from help topics list

    When User select credit Card from list
    Then Related page will be open


