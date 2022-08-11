Feature: As a user
         I want to verify search results page for RS Stock Part No

  Scenario Outline: User can search for RS Stock Part No
    Given user is on RS Components home page to perform Stock Part No search
    When user enters the RS Stock Part number <partn> to Search Bar
    And user clicks on submit button after setting Stock Part number
    Then search result page is displayed for RS Stock Part No <partn>

    Examples: 
      | partn  |
      | 432-6249 |
      | 423-201  |
