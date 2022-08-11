Feature: As a user
         I want to verify search results page for invalid data

  Scenario Outline: verify search results page for invalid input
    Given user is on RS Components home page to perform search
    When user enters the invalid <search> to Search Bar
    And user clicks on submit button
    Then no result found page is displayed for <search>

    Examples: 
      | search  |
      | treeeee |
      | caninnj |
