Feature: As a user
         I want to verify search results page for valid keyword

  Scenario Outline: User can search for valid keyword
    Given user is on RS Components home page to perform keyword search
    When user enters the valid <keyword> to Search Bar
    And user clicks on submit button after setting keyword
    Then search result page is displayed for keyword <keyword>

    Examples: 
      | keyword    |
      | Aux Cables |
      | Connectors |
