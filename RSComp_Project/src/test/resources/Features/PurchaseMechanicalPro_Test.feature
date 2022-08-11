Feature: As a consumer 
         I want to purchase Mechanical products and Tools
         
  Scenario: Consumer can purchase specific Hand Tools
    Given RS Components home page is displayed
    When user navigates to Clamps & Vices page
    And user clicks on basket after adding Mechanical product to it
    Then Mechanical product payement is done by user