Feature: Find a Warehouse Locations
  Background: Given Not a valid user
              When User browse to the site
              Then Costco home page will be display

              When User move cursor to find a Warehouse link
              Then Find warehouse page should be dropdown

  Scenario:Find a Warehouse by City Name

    And User enter the city name"Manhattan"
    And User click find a warehouse button
    Then Store location will be display

 Scenario: Find a Warehouse By Using City name  With Gas station and Tire Center


    Then User enter the city name"Manhattan"
    Then User click Gas station check box
    Then User click Tire center check box
    And User click find a warehouse button

    Then Store location will be display

    Scenario: Find a Warehouse By Using City name  With Optical and Pharmacy

      Then User enter the city name"Manhattan"
      Then User click Optical check box
      Then User click pharmacy check box
      Then Store location will be display

  Scenario: Find a Warehouse By Using State name

    Then User enter state name as "New York"
    Then User click find a warehouse button
    Then Store location will be display


  Scenario: Find a Warehouse By Using Zipcode

    Then User enter zip as "10461"
    Then User click find a warehouse button
    Then Store location will be display


    # Negative test
  Scenario: Find a Warehouse By Using Invalid city name

    Then User enter city name as "XXXXXXXX"
    Then User click find a warehouse button
    Then Unsuccess message will be display











