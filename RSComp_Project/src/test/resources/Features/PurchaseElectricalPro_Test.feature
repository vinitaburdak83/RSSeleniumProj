Feature: As a consumer
         I want to purchase Electrical Automation and Cables products

  Scenario: Consumer can purchase specific Cables and Wires product
    Given user is on RS Components home page
    When user navigates to Audio Cable page
    And user clicks on basket after adding Electrical item to it
    Then payement is done by user
