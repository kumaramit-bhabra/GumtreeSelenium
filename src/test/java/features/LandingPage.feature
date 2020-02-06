Feature: To test Landing Page of Google.com and functionality associated with it

  Scenario: Validate the operator is able to perform search by keyword
    Given user is on landing page
    And search for product by entering text "Cars in London" and selects it
